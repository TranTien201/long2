package com.example.long2.services;

import com.example.long2.models.Post;
import com.example.long2.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostImpl implements PostService{
    @Autowired
    PostRepository postRepository;
    @Override
    public List<Post> getAllPost() {
        return (List<Post>) postRepository.findAll();
    }
}
