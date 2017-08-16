package com.identity.models;


import com.identity.IdentityServerConstants;
import com.identity.models.enums.AccessTokenType;
import com.identity.models.enums.TokenExpiration;
import com.identity.models.enums.TokenUsage;

import java.util.*;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class Client {

    // setting grant types should be atomic
    public Collection<String> allowedGrantTypes = GrantTypes.Implicit;

    /// <summary>
    /// Specifies if client is enabled (defaults to true)
    /// </summary>
    public boolean enabled  = true;

    /// <summary>
    /// Unique ID of the client
    /// </summary>
    public String clientId ;

    /// <summary>
    /// Gets or sets the protocol type.
    /// </summary>
    /// <value>
    /// The protocol type.
    /// </value>
    public String protocolType  = IdentityServerConstants.ProtocolTypes.OpenIdConnect;

    /// <summary>
    /// Client secrets - only relevant for flows that require a secret
    /// </summary>
    public Collection<Secret> clientSecrets  = new HashSet<>();

    /// <summary>
    /// If set to false, no client secret is needed to request tokens at the token endpoint (defaults to true)
    /// </summary>
    public boolean requireClientSecret  = true;

    /// <summary>
    /// Client display name (used for logging and consent screen)
    /// </summary>
    public String clientName ;

    /// <summary>
    /// URI to further information about client (used on consent screen)
    /// </summary>
    public String clientUri ;

    /// <summary>
    /// URI to client logo (used on consent screen)
    /// </summary>
    public String logoUri ;

    /// <summary>
    /// Specifies whether a consent screen is required (defaults to true)
    /// </summary>
    public boolean requireConsent  = true;

    /// <summary>
    /// Specifies whether user can choose to store consent decisions (defaults to true)
    /// </summary>
    public boolean allowRememberConsent  = true;


    /// <summary>
    /// Specifies whether a proof key is required for authorization code based token requests
    /// </summary>
    public boolean requirePkce = false;

    /// <summary>
    /// Specifies whether a proof key can be sent using plain method (not recommended and default to false)
    /// </summary>
    public boolean allowPlainTextPkce = false;

    /// <summary>
    /// Controls whether access tokens are transmitted via the browser for this client (defaults to false).
    /// This can prevent accidental leakage of access tokens when multiple response types are allowed.
    /// </summary>
    /// <value>
    /// <c>true</c> if access tokens can be transmitted via the browser; otherwise, <c>false</c>.
    /// </value>
    public boolean allowAccessTokensViaBrowser = false;

    /// <summary>
    /// Specifies allowed URIs to return tokens or authorization codes to
    /// </summary>
    public Collection<String> redirectUris = new HashSet<>();

    /// <summary>
    /// Specifies allowed URIs to redirect to after logout
    /// </summary>
    public Collection<String> postLogoutRedirectUris = new HashSet<String>();

    /// <summary>
    /// Specifies logout URI at client for HTTP front-channel based logout.
    /// </summary>
    public String frontChannelLogoutUri;

    /// <summary>
    /// Specifies is the user's session id should be sent to the FrontChannelLogoutUri. Defaults to true.
    /// </summary>
    public boolean frontChannelLogoutSessionRequired = true;

    /// <summary>
    /// Specifies logout URI at client for HTTP back-channel based logout.
    /// </summary>
    public String backChannelLogoutUri;

    /// <summary>
    /// Specifies is the user's session id should be sent to the BackChannelLogoutUri. Defaults to true.
    /// </summary>
    public boolean backChannelLogoutSessionRequired = true;

    /// <summary>
    /// Gets or sets a value indicating whether [allow offline access].
    /// </summary>
    public boolean allowOfflineAccess = false;

    /// <summary>
    /// Specifies the api scopes that the client is allowed to request. If empty, the client can't access any scope
    /// </summary>
    public Collection<String> allowedScopes = new HashSet<String>();

    /// <summary>
    /// When requesting both an id token and access token, should the user claims always be added to the id token instead of requring the client to use the userinfo endpoint.
    /// </summary>
    public boolean AlwaysIncludeUserClaimsInIdToken = false;

    /// <summary>
    /// Lifetime of identity token in seconds (defaults to 300 seconds / 5 minutes)
    /// </summary>
    public int IdentityTokenLifetime = 300;

    /// <summary>
    /// Lifetime of access token in seconds (defaults to 3600 seconds / 1 hour)
    /// </summary>
    public int AccessTokenLifetime = 3600;

    /// <summary>
    /// Lifetime of authorization code in seconds (defaults to 300 seconds / 5 minutes)
    /// </summary>
    public int AuthorizationCodeLifetime = 300;

    /// <summary>
    /// Maximum lifetime of a refresh token in seconds. Defaults to 2592000 seconds / 30 days
    /// </summary>
    public int AbsoluteRefreshTokenLifetime = 2592000;

    /// <summary>
    /// Sliding lifetime of a refresh token in seconds. Defaults to 1296000 seconds / 15 days
    /// </summary>
    public int SlidingRefreshTokenLifetime = 1296000;

    /// <summary>
    /// Lifetime of a user consent in seconds. Defaults to null (no expiration)
    /// </summary>
    public Integer ConsentLifetime = null;

    /// <summary>
    /// ReUse: the refresh token handle will stay the same when refreshing tokens
    /// OneTime: the refresh token handle will be updated when refreshing tokens
    /// </summary>
    public TokenUsage RefreshTokenUsage = TokenUsage.OneTimeOnly;

    /// <summary>
    /// Gets or sets a value indicating whether the access token (and its claims) should be updated on a refresh token request.
    /// </summary>
    /// <value>
    /// <c>true</c> if the token should be updated; otherwise, <c>false</c>.
    /// </value>
    public boolean UpdateAccessTokenClaimsOnRefresh = false;

    /// <summary>
    /// Absolute: the refresh token will expire on a fixed point in time (specified by the AbsoluteRefreshTokenLifetime)
    /// Sliding: when refreshing the token, the lifetime of the refresh token will be renewed (by the amount specified in SlidingRefreshTokenLifetime). The lifetime will not exceed AbsoluteRefreshTokenLifetime.
    /// </summary>        
    public TokenExpiration RefreshTokenExpiration = TokenExpiration.Absolute;

    /// <summary>
    /// Specifies whether the access token is a reference token or a self contained JWT token (defaults to Jwt).
    /// </summary>
    public AccessTokenType accessTokenType = AccessTokenType.Jwt;

    /// <summary>
    /// Gets or sets a value indicating whether the local login is allowed for this client. Defaults to <c>true</c>.
    /// </summary>
    /// <value>
    ///   <c>true</c> if local logins are enabled; otherwise, <c>false</c>.
    /// </value>
    public boolean EnableLocalLogin = true;

    /// <summary>
    /// Specifies which external IdPs can be used with this client (if list is empty all IdPs are allowed). Defaults to empty.
    /// </summary>
    public Collection<String> IdentityProviderRestrictions = new HashSet<String>();

    /// <summary>
    /// Gets or sets a value indicating whether JWT access tokens should include an identifier
    /// </summary>
    /// <value>
    /// <c>true</c> to add an id; otherwise, <c>false</c>.
    /// </value>
    public boolean IncludeJwtId = false;

    /// <summary>
    /// Allows settings claims for the client (will be included in the access token).
    /// </summary>
    /// <value>
    /// The claims.
    /// </value>
    //TODO:  add claim content
    public Collection<Claim> Claims = new HashSet<Claim>();

    /// <summary>
    /// Gets or sets a value indicating whether client claims should be always included in the access tokens - or only for client credentials flow.
    /// </summary>
    /// <value>
    /// <c>true</c> if claims should always be sent; otherwise, <c>false</c>.
    /// </value>
    public boolean AlwaysSendClientClaims = false;

    /// <summary>
    /// Gets or sets a value indicating whether all client claims should be prefixed.
    /// </summary>
    /// <value>
    /// <c>true</c> if client claims should be prefixed; otherwise, <c>false</c>.
    /// </value>
    public boolean PrefixClientClaims = true;

    /// <summary>
    /// Gets or sets the allowed CORS origins for JavaScript clients.
    /// </summary>
    /// <value>
    /// The allowed CORS origins.
    /// </value>
    public Collection<String> AllowedCorsOrigins = new HashSet<String>();

    /// <summary>
    /// Validates the grant types.
    /// </summary>
    /// <param name="grantTypes">The grant types.</param>
    /// <exception cref="System.InvalidOperationException">
    /// Grant types list is empty
    /// or
    /// Grant types cannot contain spaces
    /// or
    /// Grant types list contains duplicate values
    /// </exception>
    public static void ValidateGrantTypes(Collection<String> grantTypes)
    {
        // must set at least one grant type
        if (grantTypes.isEmpty())
        {
            throw new IllegalArgumentException("Grant types list is empty");
        }

        // spaces are not allowed in grant types
        for (String type : grantTypes)
        {
            if (type.contains(" "))
            {
                throw new IllegalArgumentException("Grant types cannot contain spaces");
            }
        }

        // single grant type, seems to be fine
        if (grantTypes.size() == 1) return;

        // don't allow duplicate grant types
        /*if (grantTypes.size() != grantTypes.().Count())
        {
            throw new IllegalArgumentException("Grant types list contains duplicate values");
        }*/

        // would allow response_type downgrade attack from code to token
        DisallowGrantTypeCombination(GrantType.Implicit, GrantType.AuthorizationCode, grantTypes);
        DisallowGrantTypeCombination(GrantType.Implicit, GrantType.Hybrid, grantTypes);

        DisallowGrantTypeCombination(GrantType.AuthorizationCode, GrantType.Hybrid, grantTypes);
    }

    private static void DisallowGrantTypeCombination(String value1, String value2, Collection<String> grantTypes)
    {
        if (grantTypes.contains(value1) &&
                grantTypes.contains(value2))
        {
            throw new IllegalArgumentException(String.format("Grant types list cannot contain both {0} and {1}", value1, value2));
        }
    }



}
