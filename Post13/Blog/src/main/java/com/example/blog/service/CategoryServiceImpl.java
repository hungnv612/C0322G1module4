package com.example.blog.service;

import com.example.blog.model.Category;
import com.example.blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public void create(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void edit(Category category) {
        iCategoryRepository.update(category.getName(), category.getId());
    }

    @Override
    public void delete(int id) {
        Category category = findById(id);
        iCategoryRepository.delete(category);
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Category> search(Pageable pageable, String name) {
        return iCategoryRepository.findByName(pageable, "%" + name + "%");
    }
}
