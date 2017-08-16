package com.identity.configuration.injection;

import com.identity.IdentityServerConstants;
import com.identity.models.Client;
import com.identity.models.GrantTypes;
import com.identity.stores.IClientStore;
import com.identity.stores.InMemory.InMemoryClientStore;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/**
 * Created by simonzh on 7/29/2017.
 */
@Component
public class BeansInjection {

    @Bean
    Executor asyncExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("IdentityServer-");
        executor.initialize();
        return executor;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public IClientStore clientStore(){

        Client authcodeClient = new Client();
        authcodeClient.clientId = "authcode";
        authcodeClient.clientName = "authcode";
        authcodeClient.allowedGrantTypes = GrantTypes.Code;
        authcodeClient.redirectUris = new ArrayList<>();
        authcodeClient.redirectUris.add("http://localhost:8888");
        authcodeClient.allowedScopes = new HashSet<>();
        authcodeClient.allowedScopes.add(IdentityServerConstants.StandardScopes.OpenId);

        HashSet<Client> clients = new HashSet<>();
        clients.add(authcodeClient);
        return new InMemoryClientStore(clients);
    }

}
