package com.identity.stores;

import com.identity.models.User;

/**
 * Created by zhangpengcheng on 17/8/16.
 */
public interface IUserStore {

     User validateUser(String username, String password);
}
