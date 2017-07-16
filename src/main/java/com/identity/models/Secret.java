package com.identity.models;

import com.identity.IdentityServerConstants;

import java.util.Date;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Secret {

    /// <summary>
    /// Gets or sets the description.
    /// </summary>
    /// <value>
    /// The description.
    /// </value>
    public String Description ;

    /// <summary>
    /// Gets or sets the value.
    /// </summary>
    /// <value>
    /// The value.
    /// </value>
    public String Value ;

    /// <summary>
    /// Gets or sets the expiration.
    /// </summary>
    /// <value>
    /// The expiration.
    /// </value>
    public Date Expiration ;

    /// <summary>
    /// Gets or sets the type of the client secret.
    /// </summary>
    /// <value>
    /// The type of the client secret.
    /// </value>
    public String Type ;

    /// <summary>
    /// Initializes a new instance of the <see cref="Secret"/> class.
    /// </summary>
    public Secret()
    {
        Type = IdentityServerConstants.SecretTypes.SharedSecret;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Secret"/> class.
    /// </summary>
    /// <param name="value">The value.</param>
    /// <param name="expiration">The expiration.</param>
    public Secret(String value, Date expiration)

    {
         this();
        Value = value;
        Expiration = expiration;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Secret" /> class.
    /// </summary>
    /// <param name="value">The value.</param>
    /// <param name="description">The description.</param>
    /// <param name="expiration">The expiration.</param>
    public Secret(String value, String description, Date expiration)

    {
        this();
        Description = description;
        Value = value;
        Expiration = expiration;
    }

    /// <summary>
    /// Returns a hash code for this instance.
    /// </summary>
    /// <returns>
    /// A hash code for this instance, suitable for use in hashing algorithms and data structures like a hash table. 
    /// </returns>
    public  int GetHashCode()
    {

            int hash = 17;
            hash = hash * 23 + Value.hashCode();
            hash = hash * 23 + Type.hashCode();

            return hash;

    }

    /// <summary>
    /// Determines whether the specified <see cref="System.Object" />, is equal to this instance.
    /// </summary>
    /// <param name="obj">The <see cref="System.Object" /> to compare with this instance.</param>
    /// <returns>
    ///   <c>true</c> if the specified <see cref="System.Object" /> is equal to this instance; otherwise, <c>false</c>.
    /// </returns>
    public  boolean Equals(Secret other)
    {
        if (other == null) return false;

        return other.Type.equals(Type)  && other.Value.equals(Value);
    }
}
