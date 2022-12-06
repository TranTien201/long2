package com.example.long2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "contact")
public class ContactController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String contactPage(ModelMap modelMap) {
        return "contact";
    }
}
