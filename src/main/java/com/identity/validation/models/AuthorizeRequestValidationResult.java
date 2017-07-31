package com.identity.validation.models;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class AuthorizeRequestValidationResult extends ValidationResult{


    public AuthorizeRequestValidationResult()
    {
        isError = false;
    }


    public AuthorizeRequestValidationResult(String error, String errorDescription)
    {

        isError = true;
        this.error = error;
        this.errorDescription = errorDescription;
    }


    //public ValidatedAuthorizeRequest validatedRequest;

}
