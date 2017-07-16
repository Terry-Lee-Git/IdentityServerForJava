package com.identity;

/**
 * Created by zhangpengcheng on 17/7/9.
 */
public class IdentityServerConstants {
    public static final String LocalIdentityProvider = "local";
    public static final String DefaultCookieAuthenticationScheme = "idsrv";
    public static final String SignoutScheme = "idsrv";
    public static final String ExternalCookieAuthenticationScheme = "idsrv.external";

    public static class ProtocolTypes
    {
        public static final String OpenIdConnect = "oidc";
        public static final String WsFederation = "wsfed";
        public static final String Saml2p = "saml2p";
    }

    public static class TokenTypes
    {
        public static final String IdentityToken = "id_token";
        public static final String AccessToken = "access_token";
    }

    public static class ClaimValueTypes
    {
        public static final String Json = "json";
    }

    public static class ParsedSecretTypes
    {
        public static final String NoSecret = "NoSecret";
        public static final String SharedSecret = "SharedSecret";
        public static final String X509Certificate = "X509Certificate";
        public static final String JwtBearer = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    }

    public static class SecretTypes
    {
        public static final String SharedSecret = "SharedSecret";
        public static final String X509CertificateThumbprint = "X509Thumbprint";
        public static final String X509CertificateName = "X509Name";
        public static final String X509CertificateBase64 = "X509CertificateBase64";
    }

    public static class ProfileDataCallers
    {
        public static final String UserInfoEndpoint = "UserInfoEndpoint";
        public static final String ClaimsProviderIdentityToken = "ClaimsProviderIdentityToken";
        public static final String ClaimsProviderAccessToken = "ClaimsProviderAccessToken";
    }

    public static class ProfileIsActiveCallers
    {
        public static final String AuthorizeEndpoint = "AuthorizeEndpoint";
        public static final String IdentityTokenValidation = "IdentityTokenValidation";
        public static final String AccessTokenValidation = "AccessTokenValidation";
        public static final String ResourceOwnerValidation = "ResourceOwnerValidation";
        public static final String RefreshTokenValidation = "RefreshTokenValidation";
        public static final String AuthorizationCodeValidation = "AuthorizationCodeValidation";
    }

    public static class StandardScopes
    {
        /// <summary>REQUIRED. Informs the Authorization Server that the Client is making an OpenID Connect request. If the <c>openid</c> scope value is not present, the behavior is entirely unspecified.</summary>
        public static final String OpenId = "openid";
        /// <summary>OPTIONAL. This scope value requests access to the End-User's default profile Claims, which are: <c>name</c>, <c>family_name</c>, <c>given_name</c>, <c>middle_name</c>, <c>nickname</c>, <c>preferred_username</c>, <c>profile</c>, <c>picture</c>, <c>website</c>, <c>gender</c>, <c>birthdate</c>, <c>zoneinfo</c>, <c>locale</c>, and <c>updated_at</c>.</summary>
        public static final String Profile = "profile";
        /// <summary>OPTIONAL. This scope value requests access to the <c>email</c> and <c>email_verified</c> Claims.</summary>
        public static final String Email = "email";
        /// <summary>OPTIONAL. This scope value requests access to the <c>address</c> Claim.</summary>
        public static final String Address = "address";
        /// <summary>OPTIONAL. This scope value requests access to the <c>phone_number</c> and <c>phone_number_verified</c> Claims.</summary>
        public static final String Phone = "phone";
        /// <summary>This scope value MUST NOT be used with the OpenID Connect Implicit Client Implementer's Guide 1.0. See the OpenID Connect Basic Client Implementer's Guide 1.0 (http://openid.net/specs/openid-connect-implicit-1_0.html#OpenID.Basic) for its usage in that subset of OpenID Connect.</summary>
        public static final String OfflineAccess = "offline_access";
    }

    public static class PersistedGrantTypes
    {
        public static final String AuthorizationCode = "authorization_code";
        public static final String ReferenceToken = "reference_token";
        public static final String RefreshToken = "refresh_token";
        public static final String UserConsent = "user_consent";
    }
}
