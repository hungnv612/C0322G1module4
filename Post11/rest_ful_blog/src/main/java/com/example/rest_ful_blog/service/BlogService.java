package com.example.rest_ful_blog.service;

import com.example.rest_ful_blog.model.Blog;
import com.example.rest_ful_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {

    @Autowired
    IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll( ) {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return iBlogRepository.findById(id);
    }


    @Override
    public void remove(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.update(blog.getNameBlog(),blog.getContent(),blog.getId());
    }

    @Override
    public List<Blog> findByName(String name) {
        return iBlogRepository.findByNameBlogContaining(name);
    }


}
