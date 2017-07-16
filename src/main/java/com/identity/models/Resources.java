package com.identity.models;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Resources {

    /// <summary>
    /// Gets or sets a value indicating whether [offline access].
    /// </summary>
    /// <value>
    ///   <c>true</c> if [offline access]; otherwise, <c>false</c>.
    /// </value>
    public boolean OfflineAccess;
    /// <summary>
    /// Gets or sets the identity resources.
    /// </summary>
    public Collection<IdentityResource> IdentityResources = new HashSet<IdentityResource>();
    /// <summary>
    /// Gets or sets the API resources.
    /// </summary>
    public Collection<ApiResource> ApiResources = new HashSet<ApiResource>();

    /// <summary>
    /// Initializes a new instance of the <see cref="Resources"/> class.
    /// </summary>
    public Resources() {
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Resources"/> class.
    /// </summary>
    /// <param name="other">The other.</param>
    public Resources(Resources other)

    {
        this(other.IdentityResources, other.ApiResources);
        OfflineAccess = other.OfflineAccess;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Resources"/> class.
    /// </summary>
    /// <param name="identityResources">The identity resources.</param>
    /// <param name="apiResources">The API resources.</param>
    public Resources(Collection<IdentityResource> identityResources, Collection<ApiResource> apiResources) {
        IdentityResources = new HashSet<IdentityResource>(identityResources);
        ApiResources = new HashSet<ApiResource>(apiResources);
    }

}
