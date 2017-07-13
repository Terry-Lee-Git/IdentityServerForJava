package com.identity.models;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Resource {

    protected boolean enabled = true;
    protected String name;
    protected String displayName;
    protected String description;
    protected Collection<String> UserClaims = new HashSet<>();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<String> getUserClaims() {
        return UserClaims;
    }

    public void setUserClaims(Collection<String> userClaims) {
        UserClaims = userClaims;
    }
}
