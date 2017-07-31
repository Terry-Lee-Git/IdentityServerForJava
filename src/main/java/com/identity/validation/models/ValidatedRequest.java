package com.identity.validation.models;

import com.identity.configuration.injection.IdentityServerOptions;
import com.identity.models.Claim;
import com.identity.models.ClaimsPrincipal;
import com.identity.models.Client;
import com.identity.models.enums.AccessTokenType;
import com.identity.validation.ScopeValidator;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class ValidatedRequest {

    protected Map<String, String> raw;
    protected Client client;
    protected int accessTokenLifetime;
    protected Set<Claim> clientClaims = new HashSet<Claim>();
    protected AccessTokenType accessTokenType;
    protected ClaimsPrincipal subject;
    protected String SessionId;
    protected IdentityServerOptions Options;
    protected ScopeValidator ValidatedScopes;

    public void setClient(Client client)
    {
        this.client = client;
        accessTokenLifetime = client.AccessTokenLifetime;
        accessTokenType = client.accessTokenType;
        clientClaims = client.Claims.stream().map(c -> new Claim(c.getType(), c.getValue(),c.getValueType(), c.getIssuer()))
                .collect(Collectors.toSet());

    }


}
