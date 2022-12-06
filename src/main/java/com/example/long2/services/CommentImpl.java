package com.example.long2.services;

import com.example.long2.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentImpl implements CommentService{
    @Autowired
    CommentRepository commentRepository;
    @Override
    public Long countCommentByPostID(int postID) {
        return commentRepository.countCommentByPostID(postID);
    }
}
