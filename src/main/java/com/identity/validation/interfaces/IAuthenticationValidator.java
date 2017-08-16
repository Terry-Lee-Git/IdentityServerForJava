package com.identity.validation.interfaces;

import com.identity.models.User;

/**
 * Created by zhangpengcheng on 17/8/16.
 */
public interface IAuthenticationValidator {

    User validateUser(String username, String password);

}
