package com.identity.validation.interfaces;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public interface IAuthorizeRequestValidator {

    CompletableFuture<AuthorizeRequestValidationResult> validateAsync(Map<String, String> parameters, ClaimsPrincipal subject);
}
