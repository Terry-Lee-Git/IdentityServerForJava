package com.identity.models;

import java.util.HashSet;

/**
 * Created by zhangpengcheng on 17/7/12.
 */
public class GrantTypes {
    public static HashSet<String> Implicit =
            new HashSet<String>() {{
                add(GrantType.Implicit);
            }};

    public static HashSet<String> ImplicitAndClientCredentials =
            new HashSet<String>() {{
                add(GrantType.Implicit);
                add(GrantType.ClientCredentials);
            }};

    public static HashSet<String> Code =
            new HashSet<String>() {{
                add(GrantType.AuthorizationCode);
            }};

    public static HashSet<String> CodeAndClientCredentials =
            new HashSet<String>() {{
                add(GrantType.AuthorizationCode);
                add(GrantType.ClientCredentials);
            }};

    public static HashSet<String> Hybrid =
            new HashSet<String>() {{
                add(GrantType.Hybrid);
            }};

    public static HashSet<String> HybridAndClientCredentials =
            new HashSet<String>() {{
                add(GrantType.Hybrid); add(GrantType.ClientCredentials);
            }};

    public static HashSet<String> ClientCredentials =
            new HashSet<String>() {{
                add(GrantType.ClientCredentials);
            }};

    public static HashSet<String> ResourceOwnerPassword =
            new HashSet<String>() {{
                add(GrantType.ResourceOwnerPassword);
            }};

    public static HashSet<String> ResourceOwnerPasswordAndClientCredentials =
            new HashSet<String>() {{
                add(GrantType.ResourceOwnerPassword); add(GrantType.ClientCredentials);
            }};
}
