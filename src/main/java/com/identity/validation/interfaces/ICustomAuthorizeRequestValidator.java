package com.identity.validation.interfaces;

import com.identity.validation.models.AuthorizeRequestValidationResult;

import java.util.Map;

/**
 * Created by zhangpengcheng on 17/8/7.
 */
public interface ICustomAuthorizeRequestValidator {

    AuthorizeRequestValidationResult validate(Map<String, String> parameter);
}
