package com.example.long2.controllers;

import com.example.long2.models.Post;
import com.example.long2.services.PostImpl;
import com.example.long2.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(path = "")
public class HomeController {
    @Autowired
    ServiceImpl service;
    @Autowired
    PostImpl post;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String homePage(ModelMap modelMap) {
        service.addModelMapHome(modelMap);
        List<Post> postList1 = post.getAllPost();
        modelMap.addAttribute("postList1", postList1);
        // lấy tag, lấy post
        return "index";
    }
}
