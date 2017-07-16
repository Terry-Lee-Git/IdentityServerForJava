package com.identity.models;

import com.identity.Infrastructure.IdentityServerDateTime;

import java.util.Collection;
import java.util.Date;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Consent {
    /// <summary>
    /// Gets or sets the subject identifier.
    /// </summary>
    /// <value>
    /// The subject identifier.
    /// </value>
    public String SubjectId ;

    /// <summary>
    /// Gets or sets the client identifier.
    /// </summary>
    /// <value>
    /// The client identifier.
    /// </value>
    public String ClientId ;

    /// <summary>
    /// Gets or sets the scopes.
    /// </summary>
    /// <value>
    /// The scopes.
    /// </value>
    public Collection<String> Scopes ;

    /// <summary>
    /// Gets or sets the creation time.
    /// </summary>
    /// <value>
    /// The creation time.
    /// </value>
    public Date CreationTime  = IdentityServerDateTime.UtcNow;

    /// <summary>
    /// Gets or sets the expiration.
    /// </summary>
    /// <value>
    /// The expiration.
    /// </value>
    public Date Expiration ;
}
