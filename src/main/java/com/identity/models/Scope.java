package com.identity.models;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Scope {

    public String Name;
    public String DisplayName;
    public String Description;
    public boolean Required = false;
    public boolean Emphasize = false;
    public boolean ShowInDiscoveryDocument = true;
    public Collection<String> UserClaims = new HashSet<>();


    public Scope() {
    }


    public Scope(String name)

    {
        this(name, name, null);
    }


    public Scope(String name, String displayName)

    {
        this(name, displayName, null);
    }


    public Scope(String name, Collection<String> claimTypes)

    {
        this(name, name, claimTypes);
    }


    public Scope(String name, String displayName, Collection<String> claimTypes) {
        if (name.isEmpty()) throw new NullPointerException();

        Name = name;
        DisplayName = displayName;
        if (!claimTypes.isEmpty()) {
            for (String type : claimTypes) {
                UserClaims.add(type);
            }
        }
    }
}
