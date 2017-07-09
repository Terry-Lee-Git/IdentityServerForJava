package com.identity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangpengcheng on 17/7/9.
 */
@Controller
@RequestMapping("/connect")
public class AuthorizeController {

    @RequestMapping("/auth")
    @ResponseBody
    public String auth(){
        return "hello world";
    }
}
