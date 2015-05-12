package org.csf.rm.webapp.controller;

import org.csf.rm.webapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by andreypopikov on 02/05/15.
 */
@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String index() {
        return "auth/login";
    }

    @RequestMapping(value = "/loginError")
    public String loginError(Model model) {
        model.addAttribute("error", "Неверное сочетание E-Mail / пароль.");
        return "auth/login";
    }

    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess() {
        return "redirect:" + authService.getDefaultUrlForRole();
    }

}
