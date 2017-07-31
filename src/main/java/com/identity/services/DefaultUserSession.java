package com.identity.services;

import com.identity.models.ClaimsPrincipal;
import com.identity.services.interfaces.IUserSession;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * Created by simonzh on 7/29/2017.
 */
@Service
public class DefaultUserSession implements IUserSession {

    @Override
    @Async
    public CompletableFuture<ClaimsPrincipal> GetIdentityServerUserAsync() {
        return null;
    }
}
