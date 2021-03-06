package com.identity.models;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class ApiResource extends Resource {

    private Collection<Secret> apiSecrets = new HashSet<>();
    private Collection<Scope> scopes = new HashSet<>();

    public ApiResource() {
    }

    public ApiResource(String name, String displayName)

    {
        this(name, displayName, null);
    }

    public ApiResource(String name, Collection<String> claimTypes) {
        this(name, name, claimTypes);
    }

    public ApiResource(String name, String displayName, Collection<String> claimTypes) {
        if (name.isEmpty()) throw new NullPointerException("resource name");

        this.name = name;
        this.displayName = displayName;

        this.scopes.add(new Scope(name, displayName));

        if (!claimTypes.isEmpty()) {
            for (String type : claimTypes) {
                UserClaims.add(type);
            }
        }
    }

    public ApiResource CloneWithScopes(Collection<Scope> scopes) {

        ApiResource clone =  new ApiResource(this.name, this.name, this.UserClaims);
        clone.setApiSecrets(this.apiSecrets);
        clone.setScopes(scopes);
        clone.setEnabled(this.enabled);
        return clone;
    }

    public Collection<Secret> getApiSecrets() {
        return apiSecrets;
    }

    public void setApiSecrets(Collection<Secret> apiSecrets) {
        this.apiSecrets = apiSecrets;
    }

    public Collection<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(Collection<Scope> scopes) {
        this.scopes = scopes;
    }


}
