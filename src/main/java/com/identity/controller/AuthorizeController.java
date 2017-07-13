package com.identity.controller;

import com.identity.services.interfaces.IEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangpengcheng on 17/7/9.
 */
@Controller
@RequestMapping("/connect")
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
            IUserSession userSession,
            Logger logger) {
        _events = events;
        _validator = validator;
        _interactionGenerator = interactionGenerator;
        _consentResponseStore = consentResponseStore;
        _authorizeResponseGenerator = authorizeResponseGenerator;
        _userSession = userSession;
        _logger = logger == null ? logger : LoggerFactory.getLogger(AuthorizeController.class);
    }

    @RequestMapping("/auth")
    @ResponseBody
    public String auth() {

        return "hello world";
    }
}
