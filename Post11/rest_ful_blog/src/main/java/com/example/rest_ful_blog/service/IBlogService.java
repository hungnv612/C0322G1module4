package com.example.rest_ful_blog.service;

import com.example.rest_ful_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    List<Blog> findAll();

    Optional<Blog> findById(Integer id);

    void remove(Integer id);

    void save(Blog blog);

    void update(Blog blog);

    Page<Blog> findByName(String name,Pageable pageable);
}
