package com.identity.configuration.injection;

/**
 * Created by simonzh on 7/27/2017.
 */
public class IdentityServerOptions {
    /// <summary>
    /// Gets or sets the unique name of this server instance, e.g. https://myissuer.com.
    /// If not set, the issuer name is inferred from the request
    /// </summary>
    /// <value>
    /// Unique name of this server instance, e.g. https://myissuer.com
    /// </value>
    public String IssuerUri ;

    /// <summary>
    /// Gets or sets the endpoint configuration.
    /// </summary>
    /// <value>
    /// The endpoints configuration.
    /// </value>
    public EndpointsOptions Endpoints  = new EndpointsOptions();

    /// <summary>
    /// Gets or sets the discovery endpoint configuration.
    /// </summary>
    /// <value>
    /// The discovery endpoint configuration.
    /// </value>
    public DiscoveryOptions Discovery  = new DiscoveryOptions();

    /// <summary>
    /// Gets or sets the authentication options.
    /// </summary>
    /// <value>
    /// The authentication options.
    /// </value>
    public AuthenticationOptions Authentication  = new AuthenticationOptions();

    /// <summary>
    /// Gets or sets the events options.
    /// </summary>
    /// <value>
    /// The events options.
    /// </value>
    public EventsOptions Events  = new EventsOptions();

    /// <summary>
    /// Gets or sets the max input length restrictions.
    /// </summary>
    /// <value>
    /// The length restrictions.
    /// </value>
    public InputLengthRestrictions InputLengthRestrictions  = new InputLengthRestrictions();

    /// <summary>
    /// Gets or sets the options for the user interaction.
    /// </summary>
    /// <value>
    /// The user interaction options.
    /// </value>
    public UserInteractionOptions UserInteraction  = new UserInteractionOptions();

    /// <summary>
    /// Gets or sets the caching options.
    /// </summary>
    /// <value>
    /// The caching options.
    /// </value>
    public CachingOptions Caching  = new CachingOptions();

    /// <summary>
    /// Gets or sets the cors options.
    /// </summary>
    /// <value>
    /// The cors options.
    /// </value>
    public CorsOptions Cors  = new CorsOptions();
}

