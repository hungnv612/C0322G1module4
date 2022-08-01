package com.example.rest_ful_blog.repository;

import com.example.rest_ful_blog.model.Blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByNameBlogContaining(String name);

    @Modifying
    @Query(value = "update blog set name_blog = :nameBlog, content = :content where id = :id", nativeQuery = true)
    void update(@Param("nameBlog") String nameBlog, @Param("content") String content, @Param("id") int id);


}
