package com.identity.stores;

import com.identity.models.Client;

/**
 * Created by zhangpengcheng on 17/8/1.
 */
public interface IClientStore {

    Client FindEnabledClientById(String clientId);
}
