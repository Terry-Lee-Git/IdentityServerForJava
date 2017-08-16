package com.identity.stores.InMemory;

import com.identity.models.User;
import com.identity.stores.IUserStore;

import java.util.Collection;

/**
 * Created by zhangpengcheng on 17/8/16.
 */
public class InMemoryUserStore implements IUserStore {

    private Collection<User> users;

    public InMemoryUserStore(Collection<User> users) {

        this.users = users;
    }

    @Override
    public User validateUser(String username, String password) {
        return this.users.stream()
                .filter(user ->
                        user.getUsername().equals(username)
                        && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
}
