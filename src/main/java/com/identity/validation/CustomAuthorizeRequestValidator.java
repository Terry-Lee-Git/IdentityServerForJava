package com.identity.validation;

import com.identity.validation.interfaces.ICustomAuthorizeRequestValidator;
import com.identity.validation.models.AuthorizeRequestValidationResult;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhangpengcheng on 17/8/7.
 */
@Service
public class CustomAuthorizeRequestValidator implements ICustomAuthorizeRequestValidator {
    @Override
    public AuthorizeRequestValidationResult validate(Map<String, String> parameter) {
        return new AuthorizeRequestValidationResult();
    }
}
