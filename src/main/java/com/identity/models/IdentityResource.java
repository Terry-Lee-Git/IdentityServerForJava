package com.identity.models;

import java.util.Collection;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class IdentityResource extends Resource{

    /// <summary>
    /// Initializes a new instance of the <see cref="IdentityResource"/> class.
    /// </summary>
    public IdentityResource()
    {
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="IdentityResource"/> class.
    /// </summary>
    /// <param name="name">The name.</param>
    /// <param name="claimTypes">The claim types.</param>
    public IdentityResource(String name, Collection<String> claimTypes)
    {
        this(name, name, claimTypes);
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="IdentityResource"/> class.
    /// </summary>
    /// <param name="name">The name.</param>
    /// <param name="displayName">The display name.</param>
    /// <param name="claimTypes">The claim types.</param>
    /// <exception cref="System.ArgumentNullException">name</exception>
    /// <exception cref="System.ArgumentException">Must provide at least one claim type - claimTypes</exception>
    public IdentityResource(String name, String displayName, Collection<String> claimTypes)
    {
        if (name.isEmpty()) throw new NullPointerException("name");
        if (claimTypes.isEmpty()) throw new IllegalArgumentException("Must provide at least one claim type");

        this.name = name;
        this.displayName = displayName;

        for(String type : claimTypes)
        {
            UserClaims.add(type);
        }
    }

    /// <summary>
    /// Specifies whether the user can de-select the scope on the consent screen (if the consent screen wants to implement such a feature). Defaults to false.
    /// </summary>
    public boolean Required = false;

    /// <summary>
    /// Specifies whether the consent screen will emphasize this scope (if the consent screen wants to implement such a feature). 
    /// Use this setting for sensitive or important scopes. Defaults to false.
    /// </summary>
    public boolean Emphasize = false;

    /// <summary>
    /// Specifies whether this scope is shown in the discovery document. Defaults to true.
    /// </summary>
    public boolean ShowInDiscoveryDocument = true;
}
