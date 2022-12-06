package com.example.long2.controllers;

import com.example.long2.models.User;
import com.example.long2.services.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping(path = "login")
public class LoginController {
    @Autowired
    UserImpl user;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String loginForm(ModelMap modelMap) {
        return "login";
    }
    @RequestMapping(value = "/login-user")
    public String loginHomePage(ModelMap modelMap,
                                @RequestParam("userName") String userName,
                                @RequestParam("password") String password,
                                HttpServletRequest request,
                                HttpSession httpSession) {
        User user1 = user.checkLogin(userName, password);
        if(user1 != null) {
            httpSession = request.getSession(true);
            httpSession.setAttribute("userName", userName);
            return "redirect:/";
        }
        return "login";
    }
}
