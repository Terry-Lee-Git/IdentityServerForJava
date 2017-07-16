package com.identity.models;

import com.identity.Infrastructure.IdentityServerDateTime;

import javax.security.auth.Subject;
import java.util.Collection;
import java.util.Date;

public class AuthrizationCode {

    public Date creationTime = IdentityServerDateTime.UtcNow;

    public int lifetime;

    public String clientId;

    //TODO: change to responding subject to ClaimsPrincipal
    public Subject subject;

    public boolean isOpenId;

    public Collection<String> requestedScopes;

    public String redirectUri;

    public String nonce;

    public boolean wasConsentShown;

    public String sessionId;

    public String codeChallenge;

    public String codeChallengeMethod;
}
