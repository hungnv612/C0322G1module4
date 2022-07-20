package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    List<Blog> findAll();

    Optional<Blog> findById(Integer id);

    void remove(Integer id);
}
