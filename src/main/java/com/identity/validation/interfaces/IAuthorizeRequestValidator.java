package com.identity.validation.interfaces;

import com.identity.models.ClaimsPrincipal;
import com.identity.validation.models.AuthorizeRequestValidationResult;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public interface IAuthorizeRequestValidator {

    AuthorizeRequestValidationResult validate(Map<String, String> parameters, ClaimsPrincipal subject);

    AuthorizeRequestValidationResult validate(Map<String, String> parameters);
}
