package com.identity.configuration.injection;

/**
 * Created by simonzh on 7/27/2017.
 */
public class InputLengthRestrictions {

    private final int Default = 100;

    /// <summary>
    /// Max length for client_id
    /// </summary>
    public int ClientId  = Default;

    /// <summary>
    /// Max length for external client secrets
    /// </summary>
    public int ClientSecret  = Default;

    /// <summary>
    /// Max length for scope
    /// </summary>
    public int Scope  = 300;

    /// <summary>
    /// Max length for redirect_uri
    /// </summary>
    public int RedirectUri  = 400;

    /// <summary>
    /// Max length for nonce
    /// </summary>
    public int Nonce  = 300;

    /// <summary>
    /// Max length for ui_locale
    /// </summary>
    public int UiLocale  = Default;

    /// <summary>
    /// Max length for login_hint
    /// </summary>
    public int LoginHint  = Default;

    /// <summary>
    /// Max length for acr_values
    /// </summary>
    public int AcrValues  = 300;

    /// <summary>
    /// Max length for grant_type
    /// </summary>
    public int GrantType  = Default;

    /// <summary>
    /// Max length for username
    /// </summary>
    public int UserName  = Default;

    /// <summary>
    /// Max length for password
    /// </summary>
    public int Password  = Default;

    /// <summary>
    /// Max length for CSP reports
    /// </summary>
    public int CspReport  = 2000;

    /// <summary>
    /// Max length for external identity provider name
    /// </summary>
    public int IdentityProvider  = Default;

    /// <summary>
    /// Max length for external identity provider errors
    /// </summary>
    public int ExternalError  = Default;

    /// <summary>
    /// Max length for authorization codes
    /// </summary>
    public int AuthorizationCode  = Default;

    /// <summary>
    /// Max length for refresh tokens
    /// </summary>
    public int RefreshToken  = Default;

    /// <summary>
    /// Max length for token handles
    /// </summary>
    public int TokenHandle  = Default;

    /// <summary>
    /// Max length for JWTs
    /// </summary>
    public int Jwt  = 51200;

    /// <summary>
    /// Min length for the code challenge
    /// </summary>
    public int CodeChallengeMinLength  = 43;

    /// <summary>
    /// Max length for the code challenge
    /// </summary>
    public int CodeChallengeMaxLength  = 128;

    /// <summary>
    /// Min length for the code verifier
    /// </summary>
    public int CodeVerifierMinLength  = 43;

    /// <summary>
    /// Max length for the code verifier
    /// </summary>
    public int CodeVerifierMaxLength  = 128;
}
