package com.example.long2.services;

import com.example.long2.models.Post;
import com.example.long2.models.Tag;
import com.example.long2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    Map<Integer, String> authorMap = new HashMap<>();
    @Autowired
    PostImpl post;
    @Autowired
    TagImpl tag;

    @Autowired
    UserImpl user;
    @Override
    public void addModelMapHome(ModelMap modelMap) {
        List<Tag> tagList = tag.getAllTag();
        List<Post> postList = post.getAllPost();
        for(User u : user.getAllUser()) {
            authorMap.put(u.getUserID(), u.getUserName());
        }
        modelMap.addAttribute("posts", postList);
        modelMap.addAttribute("tags", tagList);
        modelMap.addAttribute("users", authorMap);
    }
}
