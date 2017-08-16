package com.identity.validation;

import com.identity.models.User;
import com.identity.validation.interfaces.IAuthenticationValidator;

/**
 * Created by zhangpengcheng on 17/8/16.
 */
public class AuthenticationValidator implements IAuthenticationValidator{

    @Override
    public User validateUser(String username, String password) {
        return null;
    }
}
