package com.identity.controller;

import com.google.gson.Gson;
import com.identity.models.User;
import com.identity.responseHandler.interfaces.IAuthorizeInteractionResponseGenerator;
import com.identity.responseHandler.interfaces.IAuthorizeResponseGenerator;
import com.identity.services.interfaces.IAuthorizeCodeService;
import com.identity.services.interfaces.ITokenService;
import com.identity.services.interfaces.IUserSession;
import com.identity.stores.IUserStore;
import com.identity.validation.interfaces.IAuthorizeRequestValidator;
import org.jose4j.jwk.JsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by zhangpengcheng on 17/7/9.
 */
@Controller
@RequestMapping("/connect/authorize")
public class AuthorizeController extends WebMvcConfigurerAdapter {

    private final Logger _logger;
    //private IEventService _events;
    private IAuthorizeRequestValidator _validator;
    private IAuthorizeInteractionResponseGenerator _interactionGenerator;
    //private IConsentMessageStore _consentResponseStore;
    private IAuthorizeResponseGenerator _authorizeResponseGenerator;
    private IUserSession _userSession;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private ITokenService tokenService;

    @Autowired
    private IUserStore userStore;

    @Autowired
    private IAuthorizeCodeService authcodeService;

    @Value("${token.keyId}")
    private String keyId;

    @Autowired
    public AuthorizeController(
            IAuthorizeRequestValidator validator) {

        _logger = LoggerFactory.getLogger(AuthorizeController.class);
    }

    @GetMapping("")
    @ResponseBody
    public String view(Map<String, String> parameters) throws Exception {


        RsaJsonWebKey jwk = RsaJwkGenerator.generateJwk(2048);
        jwk.setKeyId(keyId);
        jwk.setAlgorithm(AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256);
        String publicKey = jwk.toJson(JsonWebKey.OutputControlLevel.PUBLIC_ONLY);
        String privateKey = jwk.toJson(JsonWebKey.OutputControlLevel.INCLUDE_PRIVATE);
        redisTemplate.opsForValue().set(keyId + "-public", publicKey);
        redisTemplate.opsForValue().set(keyId + "-private", privateKey);
        return redisTemplate.opsForValue().get(keyId + "-private");

    }

    @PostMapping("")
    @ResponseBody
    public String authorize(Map<String, String> parameters, HttpServletRequest request, HttpServletResponse response) throws Exception {

        User user = new Gson().fromJson(
                redisTemplate.opsForValue().get(request.getSession().getId()),
                User.class);
        if (user == null) {
            response.setStatus(403);
            return "error";
        }

        //generator authorization code
        String clientId = parameters.get("clientId");
        return authcodeService.generateAndStore(clientId);
    }

    @GetMapping("login")
    public String login() {

        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, HttpServletResponse response, HttpServletRequest request) {

        User user = userStore.validateUser(username, password);
        if (user == null)
            return "redirect:login";


        HttpSession session = request.getSession();

        redisTemplate.opsForValue().set(session.getId(), new Gson().toJson(user));

        //TODO: add original parameters
        return "redirect:.";
    }

    @PostMapping("/consent")
    @ResponseBody
    public String consent() {

        return "hello world";
    }
}
