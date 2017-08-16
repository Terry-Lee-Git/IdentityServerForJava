package com.identity.stores.InMemory;

import com.identity.models.Client;
import com.identity.stores.IClientStore;

import java.util.Collection;

/**
 * Created by zhangpengcheng on 17/8/1.
 */
public class InMemoryClientStore implements IClientStore {

    public InMemoryClientStore(Collection<Client> clients){
        this.clients = clients;
    }

    private Collection<Client> clients;

    @Override
    public Client FindEnabledClientById(String clientId) {
        return clients.stream()
                .filter(c -> c.clientId.equals(clientId) && c.enabled == true)
                .findFirst()
                .get();
    }
}
