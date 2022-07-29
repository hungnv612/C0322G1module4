package com.example.rest_ful_blog.service;

import com.example.rest_ful_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {

    Page<Category> findAll(Pageable pageable);

    void create(Category category);

    void edit(Category category);

    void delete(int id);

    Category findById(int id);

    Page<Category> search(Pageable pageable, String name);

}
