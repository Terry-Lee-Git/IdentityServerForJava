package com.identity.validation;

import com.identity.IdentityServerConstants;
import com.identity.configuration.injection.IdentityServerOptions;
import com.identity.models.ClaimsPrincipal;
import com.identity.models.Client;
import com.identity.models.OidcConstants;
import com.identity.stores.IClientStore;
import com.identity.validation.interfaces.IAuthorizeRequestValidator;
import com.identity.validation.interfaces.ICustomAuthorizeRequestValidator;
import com.identity.validation.models.AuthorizeRequestValidationResult;
import org.ietf.jgss.Oid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by simonzh on 7/29/2017.
 */
@Service
public class AuthorizeRequestValidator implements IAuthorizeRequestValidator {

    private IdentityServerOptions options;

    @Autowired
    private IClientStore clientStore;

    private RestTemplate restClient;

    @Autowired
    private ICustomAuthorizeRequestValidator customValidator;

    @Override
    public AuthorizeRequestValidationResult validate(Map<String, String> requestParameters, ClaimsPrincipal subject) {
        return null;
    }

    @Override
    public AuthorizeRequestValidationResult validate(Map<String, String> requestParameters) {

        //validate parameters
        return validateRequestParameters(requestParameters);
    }

    private AuthorizeRequestValidationResult validateRequestParameters(Map<String, String> requestParameters){
        //validate client and redirect_uri
        String clientId = requestParameters.get(OidcConstants.AuthorizeRequest.ClientId);
        AuthorizeRequestValidationResult clientValidation = validateClient(clientId);
        if(clientValidation.getError())
            return clientValidation;

        String redirectUri = requestParameters.get(OidcConstants.AuthorizeRequest.RedirectUri);
        AuthorizeRequestValidationResult redirectUriValidation = validateRedirectUri(redirectUri);
        if(clientValidation.getError())
            return redirectUriValidation;

        //validate state, response type and response model
        AuthorizeRequestValidationResult mandatoryResult = validateCoreParameter(requestParameters);
        if(mandatoryResult.getError())
            return mandatoryResult;

        //validate scope
        AuthorizeRequestValidationResult scopeResult = validateScope();
        if(scopeResult.getError())
            return scopeResult;

        //nonce, prompt, login hint etc
        AuthorizeRequestValidationResult optionalResult = validateOptionalParameter(requestParameters);
        if(optionalResult.getError())
            return optionalResult;

        //custom validator
        AuthorizeRequestValidationResult customResult = customValidator.validate(requestParameters);
        if(customResult.getError())
            return customResult;

        return validRequest();
    }

    private AuthorizeRequestValidationResult validateCoreParameter(Map<String, String> parameters){
        return validRequest();

    }

    private AuthorizeRequestValidationResult validateScope(){
        return validRequest();
    }

    private AuthorizeRequestValidationResult validateOptionalParameter(Map<String, String> parameter){
        return validRequest();
    }

    private AuthorizeRequestValidationResult validateClient(String clientId){
        if(isMissingOrTooLong(clientId, options.InputLengthRestrictions.ClientId))
            return invalidRequest("invalid request", "client id is missing or too long");

        Client client = clientStore.FindEnabledClientById(clientId);
        if(client == null)
            return invalidRequest("invalid request", "client id doesn't exist");

        if(client.protocolType != IdentityServerConstants.ProtocolTypes.OpenIdConnect)
            return invalidRequest(OidcConstants.AuthorizeErrors.UnauthorizedClient, "invalid protocol");

        return validRequest();
    }

    private AuthorizeRequestValidationResult validateRedirectUri(String redirectUri){
        if(isMissingOrTooLong(redirectUri, options.InputLengthRestrictions.RedirectUri))
            return invalidRequest("invalid request", "redirect Uri is missing or too long");

        ResponseEntity<String> response = restClient.getForEntity(redirectUri, String.class);
        if(response.getStatusCode() != HttpStatus.OK)
            return invalidRequest("invalid request", "redirect uri is not available");

        return validRequest();
    }

    private boolean isMissingOrTooLong(String value, int length){
        return  value == null || value.isEmpty() || value.length() > length;
    }

    private AuthorizeRequestValidationResult invalidRequest(String error, String description){
        return  new AuthorizeRequestValidationResult(error, description);
    }

    private AuthorizeRequestValidationResult validRequest(){
        return new AuthorizeRequestValidationResult();
    }


}
