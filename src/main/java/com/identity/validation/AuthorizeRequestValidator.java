package com.identity.validation;

import com.identity.configuration.injection.IdentityServerOptions;
import com.identity.models.ClaimsPrincipal;
import com.identity.models.OidcConstants;
import com.identity.validation.interfaces.IAuthorizeRequestValidator;
import com.identity.validation.models.AuthorizeRequestValidationResult;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by simonzh on 7/29/2017.
 */
@Service
public class AuthorizeRequestValidator implements IAuthorizeRequestValidator {

    private IdentityServerOptions options;
    //private ClientStores;

    @Override
    public CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> requestParameters, ClaimsPrincipal subject) {
        return null;
    }

    @Override
    public CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> requestParameters) {

        //validate parameters
        return null;
    }

    private AuthorizeRequestValidationResult validateRequestParameters(Map<String, String> requestParameters){
        //validate client and redirect_uri

        //validate state, response type and response model

        //validate scope

        //nonce, prompt, login hint etc

        //custom validator
    }

    private AuthorizeRequestValidationResult validateClient(String clientId){
        if(isMissingOrTooLong(clientId, options.InputLengthRestrictions.ClientId))
            return false;
    }

    private boolean isMissingOrTooLong(String value, int length){
        return  value == null || value.isEmpty() || value.length() > length;
    }


}
