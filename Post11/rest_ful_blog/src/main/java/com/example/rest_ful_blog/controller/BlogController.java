package com.example.rest_ful_blog.controller;

import com.example.rest_ful_blog.model.Blog;
import com.example.rest_ful_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
@RequestMapping("/blog/api/v1")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;


    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList() {
        List<Blog> blogList = iBlogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        iBlogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlogger(@PathVariable int id, @RequestBody Blog blog) {
        Optional<Blog> blog1 = iBlogService.findById(id);
        if (blog1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        blog1.get().setNameBlog(blog.getNameBlog());
        blog1.get().setContent(blog.getContent());
        blog1.get().setCategory(blog.getCategory());
        iBlogService.update(blog);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBlogger(@PathVariable int id) {
        iBlogService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> findByName(String nameFind) {
        List<Blog> searchBlog = iBlogService.findByName(nameFind);
        if (searchBlog.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(searchBlog, HttpStatus.OK);
    }


}
