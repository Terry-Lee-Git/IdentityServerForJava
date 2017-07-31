package com.identity.models;

/**
 * Created by simonzh on 7/27/2017.
 */
public class OidcConstants
{
    public static class AuthorizeRequest
    {
        public static final String Scope = "scope";
        public static final String ResponseType = "response_type";
        public static final String ClientId = "client_id";
        public static final String RedirectUri = "redirect_uri";
        public static final String State = "state";
        public static final String ResponseMode = "response_mode";
        public static final String Nonce = "nonce";
        public static final String Display = "display";
        public static final String Prompt = "prompt";
        public static final String MaxAge = "max_age";
        public static final String UiLocales = "ui_locales";
        public static final String IdTokenHint = "id_token_hint";
        public static final String LoginHint = "login_hint";
        public static final String AcrValues = "acr_values";
        public static final String CodeChallenge = "code_challenge";
        public static final String CodeChallengeMethod = "code_challenge_method";
    }
    public static class Discovery
    {
        public static final String Issuer = "issuer";
        public static final String ClaimsParameterSupported = "claims_parameter_supported";
        public static final String ClaimTypesSupported = "claim_types_supported";
        public static final String DisplayValuesSupported = "display_values_supported";
        public static final String AcrValuesSupported = "acr_values_supported";
        public static final String IdTokenEncryptionAlgorithmsSupported = "id_token_encryption_alg_values_supported";
        public static final String IdTokenEncryptionEncValuesSupported = "id_token_encryption_enc_values_supported";
        public static final String IdTokenSigningAlgorithmsSupported = "id_token_signing_alg_values_supported";
        public static final String OpPolicyUri = "op_policy_uri";
        public static final String OpTosUri = "op_tos_uri";
        public static final String RequestObjectEncryptionAlgorithmsSupported = "request_object_encryption_alg_values_supported";
        public static final String RequestObjectEncryptionEncValuesSupported = "request_object_encryption_enc_values_supported";
        public static final String RequestObjectSigningAlgorithmsSupported = "request_object_signing_alg_values_supported";
        public static final String RequestParameterSupported = "request_parameter_supported";
        public static final String RequestUriParameterSupported = "request_uri_parameter_supported";
        public static final String RequireRequestUriRegistration = "require_request_uri_registration";
        public static final String ServiceDocumentation = "service_documentation";
        public static final String TokenEndpointAuthSigningAlgorithmsSupported = "token_endpoint_auth_signing_alg_values_supported";
        public static final String UILocalesSupported = "ui_locales_supported";
        public static final String UserInfoEncryptionAlgorithmsSupported = "userinfo_encryption_alg_values_supported";
        public static final String ClaimsLocalesSupported = "claims_locales_supported";
        public static final String UserInfoEncryptionEncValuesSupported = "userinfo_encryption_enc_values_supported";
        public static final String TokenEndpointAuthenticationMethodsSupported = "token_endpoint_auth_methods_supported";
        public static final String ResponseTypesSupported = "response_types_supported";
        public static final String AuthorizationEndpoint = "authorization_endpoint";
        public static final String TokenEndpoint = "token_endpoint";
        public static final String UserInfoEndpoint = "userinfo_endpoint";
        public static final String IntrospectionEndpoint = "introspection_endpoint";
        public static final String RevocationEndpoint = "revocation_endpoint";
        public static final String DiscoveryEndpoint = ".well-known/openid-configuration";
        public static final String JwksUri = "jwks_uri";
        public static final String EndSessionEndpoint = "end_session_endpoint";
        public static final String CheckSessionIframe = "check_session_iframe";
        public static final String RegistrationEndpoint = "registration_endpoint";
        public static final String FrontChannelLogoutSupported = "frontchannel_logout_supported";
        public static final String FrontChannelLogoutSessionSupported = "frontchannel_logout_session_supported";
        public static final String BackChannelLogoutSupported = "backchannel_logout_supported";
        public static final String BackChannelLogoutSessionSupported = "backchannel_logout_session_supported";
        public static final String GrantTypesSupported = "grant_types_supported";
        public static final String CodeChallengeMethodsSupported = "code_challenge_methods_supported";
        public static final String ScopesSupported = "scopes_supported";
        public static final String SubjectTypesSupported = "subject_types_supported";
        public static final String ResponseModesSupported = "response_modes_supported";
        public static final String ClaimsSupported = "claims_supported";
        public static final String UserInfoSigningAlgorithmsSupported = "userinfo_signing_alg_values_supported";
    }
    public static class Algorithms
    {
        public static final String None = "none";

        public static class Symmetric
        {
            public static final String HS256 = "HS256";
            public static final String HS384 = "HS284";
            public static final String HS512 = "HS512";
        }
        public static class Asymmetric
        {
            public static final String RS256 = "RS256";
            public static final String RS384 = "RS384";
            public static final String RS512 = "RS512";
            public static final String ES256 = "ES256";
            public static final String ES384 = "ES384";
            public static final String ES512 = "ES512";
            public static final String PS256 = "PS256";
            public static final String PS384 = "PS384";
            public static final String PS512 = "PS512";
        }
    }
    public static class AuthenticationMethods
    {
        public static final String FacialRecognition = "face";
        public static final String UserPresenceTest = "user";
        public static final String ConfirmationByTelephone = "tel";
        public static final String ProofOfPossessionSoftwareSecuredKey = "swk";
        public static final String ConfirmationBySms = "sms";
        public static final String SmartCard = "sc";
        public static final String RetinaScanBiometric = "retina";
        public static final String RiskBasedAuthentication = "rba";
        public static final String Password = "pwd";
        public static final String PersonalIdentificationOrPattern = "pin";
        public static final String OneTimePassword = "otp";
        public static final String MultiFactorAuthentication = "mfa";
        public static final String MultipleChannelAuthentication = "mca";
        public static final String KnowledgeBasedAuthentication = "kba";
        public static final String IrisScanBiometric = "iris";
        public static final String ProofOfPossessionHardwareSecuredKey = "hwk";
        public static final String Geolocation = "geo";
        public static final String FingerprintBiometric = "fpt";
        public static final String VoiceBiometric = "vbm";
        public static final String WindowsIntegratedAuthentication = "wia";
    }
    public static class EndpointAuthenticationMethods
    {
        public static final String PostBody = "client_secret_post";
        public static final String BasicAuthentication = "client_secret_basic";
        public static final String PrivateKeyJwt = "private_key_jwt";
    }
    public static class ProtectedResourceErrors
    {
        public static final String InvalidToken = "invalid_token";
        public static final String ExpiredToken = "expired_token";
        public static final String InvalidRequest = "invalid_request";
        public static final String InsufficientScope = "insufficient_scope";
    }
    public static class CodeChallengeMethods
    {
        public static final String Plain = "plain";
        public static final String Sha256 = "S256";
    }
    public static class PromptModes
    {
        public static final String None = "none";
        public static final String Login = "login";
        public static final String Consent = "consent";
        public static final String SelectAccount = "select_account";
    }
    public static class DisplayModes
    {
        public static final String Page = "page";
        public static final String Popup = "popup";
        public static final String Touch = "touch";
        public static final String Wap = "wap";
    }
    public static class ResponseModes
    {
        public static final String FormPost = "form_post";
        public static final String Query = "query";
        public static final String Fragment = "fragment";
    }
    public static class ResponseTypes
    {
        public static final String Code = "code";
        public static final String Token = "token";
        public static final String IdToken = "id_token";
        public static final String IdTokenToken = "id_token token";
        public static final String CodeIdToken = "code id_token";
        public static final String CodeToken = "code token";
        public static final String CodeIdTokenToken = "code id_token token";
    }
    public static class ClientAssertionTypes
    {
        public static final String JwtBearer = "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    }
    public static class GrantTypes
    {
        public static final String Password = "password";
        public static final String AuthorizationCode = "authorization_code";
        public static final String ClientCredentials = "client_credentials";
        public static final String RefreshToken = "refresh_token";
        public static final String Implicit = "implicit";
        public static final String Saml2Bearer = "urn:ietf:params:oauth:grant-type:saml2-bearer";
        public static final String JwtBearer = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    }
    public static class AuthenticationSchemes
    {
        public static final String AuthorizationHeaderBearer = "Bearer";
        public static final String FormPostBearer = "access_token";
        public static final String QueryStringBearer = "access_token";
        public static final String AuthorizationHeaderPop = "PoP";
        public static final String FormPostPop = "pop_access_token";
        public static final String QueryStringPop = "pop_access_token";
    }
    public static class TokenTypes
    {
        public static final String AccessToken = "access_token";
        public static final String IdentityToken = "id_token";
        public static final String RefreshToken = "refresh_token";
    }
    public static class ClientMetadata
    {
        public static final String RedirectUris = "redirect_uris";
        public static final String RequestObjectSigningAlgorithm = "request_object_signing_alg";
        public static final String UserinfoEncryptedResponseEncryption = "userinfo_encrypted_response_enc";
        public static final String UserInfoEncryptedResponseAlgorithm = "userinfo_encrypted_response_alg";
        public static final String UserinfoSignedResponseAlgorithm = "userinfo_signed_response_alg";
        public static final String IdentityTokenEncryptedResponseEncryption = "id_token_encrypted_response_enc";
        public static final String IdentityTokenEncryptedResponseAlgorithm = "id_token_encrypted_response_alg";
        public static final String IdentityTokenSignedResponseAlgorithm = "id_token_signed_response_alg";
        public static final String RequestUris = "request_uris";
        public static final String InitiateLoginUris = "initiate_login_uri";
        public static final String DefaultAcrValues = "default_acr_values";
        public static final String RequireAuthenticationTime = "require_auth_time";
        public static final String DefaultMaxAge = "default_max_age";
        public static final String TokenEndpointAuthenticationSigningAlgorithm = "token_endpoint_auth_signing_alg";
        public static final String TokenEndpointAuthenticationMethod = "token_endpoint_auth_method";
        public static final String SubjectType = "subject_type";
        public static final String SectorIdentifierUri = "sector_identifier_uri";
        public static final String Jwks = "jwks";
        public static final String JwksUri = "jwks_uri";
        public static final String TosUri = "tos_uri";
        public static final String PolicyUri = "policy_uri";
        public static final String ClientUri = "client_uri";
        public static final String LogoUri = "logo_uri";
        public static final String ClientName = "client_name";
        public static final String Contacts = "contacts";
        public static final String ApplicationType = "application_type";
        public static final String GrantTypes = "grant_types";
        public static final String ResponseTypes = "response_types";
        public static final String RequestObjectEncryptionAlgorithm = "request_object_encryption_alg";
        public static final String RequestObjectEncryptionEncryption = "request_object_encryption_enc";
    }
    public static class RegistrationResponse
    {
        public static final String Error = "error";
        public static final String ErrorDescription = "error_description";
        public static final String ClientId = "client_id";
        public static final String ClientSecret = "client_secret";
        public static final String RegistrationAccessToken = "registration_access_token";
        public static final String RegistrationClientUri = "registration_client_uri";
        public static final String ClientIdIssuedAt = "client_id_issued_at";
        public static final String ClientSecretExpiresAt = "client_secret_expires_at";
    }
    public static class TokenResponse
    {
        public static final String AccessToken = "access_token";
        public static final String ExpiresIn = "expires_in";
        public static final String TokenType = "token_type";
        public static final String RefreshToken = "refresh_token";
        public static final String IdentityToken = "id_token";
        public static final String Error = "error";
        public static final String ErrorDescription = "error_description";
        public static final String BearerTokenType = "Bearer";
    }
    public static class TokenErrors
    {
        public static final String InvalidRequest = "invalid_request";
        public static final String InvalidClient = "invalid_client";
        public static final String InvalidGrant = "invalid_grant";
        public static final String UnauthorizedClient = "unauthorized_client";
        public static final String UnsupportedGrantType = "unsupported_grant_type";
        public static final String UnsupportedResponseType = "unsupported_response_type";
        public static final String InvalidScope = "invalid_scope";
    }
    public static class TokenRequestTypes
    {
        public static final String Bearer = "bearer";
        public static final String Pop = "pop";
    }
    public static class TokenRequest
    {
        public static final String GrantType = "grant_type";
        public static final String RedirectUri = "redirect_uri";
        public static final String ClientId = "client_id";
        public static final String ClientSecret = "client_secret";
        public static final String ClientAssertion = "client_assertion";
        public static final String ClientAssertionType = "client_assertion_type";
        public static final String Assertion = "assertion";
        public static final String Code = "code";
        public static final String RefreshToken = "refresh_token";
        public static final String Scope = "scope";
        public static final String UserName = "username";
        public static final String Password = "password";
        public static final String CodeVerifier = "code_verifier";
        public static final String TokenType = "token_type";
        public static final String Algorithm = "alg";
        public static final String Key = "key";
    }
    public static class EndSessionRequest
    {
        public static final String IdTokenHint = "id_token_hint";
        public static final String PostLogoutRedirectUri = "post_logout_redirect_uri";
        public static final String State = "state";
        public static final String Sid = "sid";
        public static final String Issuer = "iss";
    }
    public static class AuthorizeResponse
    {
        public static final String Scope = "scope";
        public static final String Code = "code";
        public static final String AccessToken = "access_token";
        public static final String ExpiresIn = "expires_in";
        public static final String TokenType = "token_type";
        public static final String RefreshToken = "refresh_token";
        public static final String IdentityToken = "id_token";
        public static final String State = "state";
        public static final String Error = "error";
        public static final String ErrorDescription = "error_description";
    }
    public static class AuthorizeErrors
    {
        public static final String InvalidRequest = "invalid_request";
        public static final String UnauthorizedClient = "unauthorized_client";
        public static final String AccessDenied = "access_denied";
        public static final String UnsupportedResponseType = "unsupported_response_type";
        public static final String InvalidScope = "invalid_scope";
        public static final String ServerError = "server_error";
        public static final String TemporarilyUnavailable = "temporarily_unavailable";
        public static final String InteractionRequired = "interaction_required";
        public static final String LoginRequired = "login_required";
        public static final String AccountSelectionRequired = "account_selection_required";
        public static final String ConsentRequired = "consent_required";
        public static final String InvalidRequestUri = "invalid_request_uri";
        public static final String InvalidRequestObject = "invalid_request_object";
        public static final String RequestNotSupported = "request_not_supported";
        public static final String RequestUriNotSupported = "request_uri_not_supported";
        public static final String RegistrationNotSupported = "registration_not_supported";
    }
    public static class Events
    {
        public static final String BackChannelLogout = "http://schemas.openid.net/event/backchannel-logout";
    }
    public static class BackChannelLogoutRequest
    {
        public static final String LogoutToken = "logout_token";
    }
}