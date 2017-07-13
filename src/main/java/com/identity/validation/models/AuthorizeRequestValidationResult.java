package com.identity.validation.models;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class AuthorizeRequestValidationResult extends ValidationResult{

    public AuthorizeRequestValidationResult(ValidatedAuthorizeRequest request)
    {
        ValidatedRequest = request;
        isError = false;
    }


    public AuthorizeRequestValidationResult(ValidatedAuthorizeRequest request, string error, string errorDescription = null)
    {
        ValidatedRequest = request;
        isError = true;
        error = error;
        errorDescription = errorDescription;
    }


    public ValidatedAuthorizeRequest validatedRequest;

}
