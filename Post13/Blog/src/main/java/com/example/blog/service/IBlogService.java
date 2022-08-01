package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> findById(Integer id);

    void remove(Integer id);

    void save(Blog blog);

    void update(Blog blog);

    Page<Blog> findByName(String name,Pageable pageable);
}
