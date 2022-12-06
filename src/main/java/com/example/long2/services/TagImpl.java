package com.example.long2.services;

import com.example.long2.models.Tag;
import com.example.long2.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagImpl implements TagService{
    @Autowired
    TagRepository tagRepository;
    @Override
    public List<Tag> getAllTag() {

        return (List<Tag>) tagRepository.findAll();
    }
}
