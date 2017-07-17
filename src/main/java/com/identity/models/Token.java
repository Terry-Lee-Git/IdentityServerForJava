package com.identity.models;

import com.identity.Infrastructure.IdentityServerDateTime;
import com.identity.models.enums.AccessTokenType;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Token {

    public Token()
    {
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Token"/> class.
    /// </summary>
    /// <param name="tokenType">Type of the token.</param>
    public Token(String tokenType)
    {
        Type = tokenType;
    }

    /// <summary>
    /// Gets or sets the audiences.
    /// </summary>
    /// <value>
    /// The audiences.
    /// </value>
    public Collection<String> Audiences = new HashSet<>();

    /// <summary>
    /// Gets or sets the issuer.
    /// </summary>
    /// <value>
    /// The issuer.
    /// </value>
    public String Issuer ;

    /// <summary>
    /// Gets or sets the creation time.
    /// </summary>
    /// <value>
    /// The creation time.
    /// </value>
    public Date CreationTime = IdentityServerDateTime.UtcNow;

    /// <summary>
    /// Gets or sets the lifetime.
    /// </summary>
    /// <value>
    /// The lifetime.
    /// </value>
    public int Lifetime ;

    /// <summary>
    /// Gets or sets the type.
    /// </summary>
    /// <value>
    /// The type.
    /// </value>
    public String Type  = OidcConstants.TokenTypes.AccessToken;

    /// <summary>
    /// Gets or sets the ID of the client.
    /// </summary>
    /// <value>
    /// The ID of the client.
    /// </value>
    public String ClientId ;

    /// <summary>
    /// Gets or sets the type of access token of the client
    /// </summary>
    /// <value>
    /// The access token type specified by the client.
    /// </value>
    public AccessTokenType accessTokenType ;

    /// <summary>
    /// Gets or sets the claims.
    /// </summary>
    /// <value>
    /// The claims.
    /// </value>
    public Collection<Claim>
            Claims  = new HashSet<Claim>();

    /// <summary>
    /// Gets or sets the version.
    /// </summary>
    /// <value>
    /// The version.
    /// </value>
    public int Version  = 4;

    /// <summary>
    /// Gets the subject identifier.
    /// </summary>
    /// <value>
    /// The subject identifier.
    /// </value>
    public String SubjectId = Claims.stream()
            .filter(x -> x.getType().equals("Subject"))
            .map(x -> x.getValue()).findFirst().orElse(null);


    /// <summary>
    /// Gets the scopes.
    /// </summary>
    /// <value>
    /// The scopes.
    /// </value>
    public Collection<String> Scopes = Claims.stream()
            .filter(x -> x.getType().equals("Scope"))
            .map(x -> x.getValue()).collect(Collectors.toList());
}
