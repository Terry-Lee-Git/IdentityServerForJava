package com.identity.validation;

import com.identity.models.ClaimsPrincipal;
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
    @Override
    public CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> parameters, ClaimsPrincipal subject) {
        return null;
    }
}
