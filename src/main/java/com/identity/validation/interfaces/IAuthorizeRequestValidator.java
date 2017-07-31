package com.identity.validation.interfaces;

import com.identity.models.ClaimsPrincipal;
import com.identity.validation.models.AuthorizeRequestValidationResult;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public interface IAuthorizeRequestValidator {

    CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> parameters, ClaimsPrincipal subject);

    CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> parameters);
}
