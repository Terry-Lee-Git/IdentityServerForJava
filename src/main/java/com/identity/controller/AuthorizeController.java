package com.identity.controller;

import com.identity.models.ClaimsPrincipal;
import com.identity.responseHandler.interfaces.IAuthorizeInteractionResponseGenerator;
import com.identity.responseHandler.interfaces.IAuthorizeResponseGenerator;
import com.identity.services.interfaces.IEventService;
import com.identity.services.interfaces.IUserSession;
import com.identity.stores.IConsentMessageStore;
import com.identity.validation.interfaces.IAuthorizeRequestValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zhangpengcheng on 17/7/9.
 */
@Controller
@RequestMapping("/connect/authorize")
public class AuthorizeController {

    private final Logger _logger;
    private IEventService _events;
    private IAuthorizeRequestValidator _validator;
    private IAuthorizeInteractionResponseGenerator _interactionGenerator;
    private IConsentMessageStore _consentResponseStore;
    private IAuthorizeResponseGenerator _authorizeResponseGenerator;
    private IUserSession _userSession;

    @Autowired
    public AuthorizeController(
            IEventService events,
            IAuthorizeRequestValidator validator,
            IAuthorizeInteractionResponseGenerator interactionGenerator,
            IConsentMessageStore consentResponseStore,
            IAuthorizeResponseGenerator authorizeResponseGenerator,
            IUserSession userSession) {
        _events = events;
        _validator = validator;
        _interactionGenerator = interactionGenerator;
        _consentResponseStore = consentResponseStore;
        _authorizeResponseGenerator = authorizeResponseGenerator;
        _userSession = userSession;
        _logger = LoggerFactory.getLogger(AuthorizeController.class);
    }

    @GetMapping("")
    @ResponseBody
    public String view(Map<String, Object> context) throws Exception {

        CompletableFuture<ClaimsPrincipal> userFuture = _userSession.GetIdentityServerUserAsync();
        CompletableFuture.allOf(userFuture).join();
        ClaimsPrincipal user = userFuture.get();
        return "hello world";
    }

    @PostMapping("")
    @ResponseBody
    public String authorize(Map<String, Object> context) {

        return "hello world";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login() {

        return "hello world";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {

        return "hello world";
    }

    @PostMapping("/consent")
    @ResponseBody
    public String consent() {

        return "hello world";
    }
}
