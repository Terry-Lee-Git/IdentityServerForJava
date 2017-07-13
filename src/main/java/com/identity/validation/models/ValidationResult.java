package com.identity.validation.models;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class ValidationResult {

    protected Boolean isError = true;

    protected String error;

    protected String errorDescription;

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
