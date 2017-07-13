package com.identity.validation.models;

import java.util.HashSet;
import java.util.Map;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class ValidatedRequest {

    protected Map<String, String> raw;
    protected Client client;
    protected int accessTokenLifetime;
    protected Set<ClientClaim> clientClaims = new HashSet<ClientClaim>(new ClaimComparer());
    protected AccessTokenType accessTokenType;
    protected ClaimsPrincipal subject;
    protected string SessionId;
    protected IdentityServerOptions Options;
    protected ScopeValidator ValidatedScopes;

    public void setClient(Client client)
    {
        this.client = client;
        accessTokenLifetime = client.AccessTokenLifetime;
        accessTokenType = client.AccessTokenType;
        clientClaims = client.Claims.Select(c => new Claim(c.Type, c.Value, c.ValueType, c.Issuer)).ToList();
    }


}
