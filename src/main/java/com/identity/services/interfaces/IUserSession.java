package com.identity.services.interfaces;

import com.identity.models.ClaimsPrincipal;

import java.util.concurrent.CompletableFuture;

/**
 * Created by simonzh on 7/29/2017.
 */
public interface IUserSession {

    CompletableFuture<ClaimsPrincipal> GetIdentityServerUserAsync();
}
