package com.example.long2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "user")
public class UserController {
    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String userPage(ModelMap modelMap, @PathVariable("userName") String userName,
                           @RequestParam("title") String title,
                           @RequestParam("content") String content,
                           @RequestParam("tags") String tags,
                           @RequestParam("status") String status) {
        System.out.println(userName);
        return "user";
    }
}
