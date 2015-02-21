package org.csf.resortmanager.controller;

import org.csf.resortmanager.model.User;
import org.csf.resortmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by agpopikov on 21/02/15.
 */
@Controller()
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("users", userService.getAll());
        model.addAttribute("user", new User());
        return "user/index";
    }

    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public String save(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/user/";
    }

}
