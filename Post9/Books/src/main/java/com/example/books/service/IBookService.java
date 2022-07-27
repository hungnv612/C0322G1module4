package com.example.books.service;

import com.example.books.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> findAll();

    Book findById(Integer id);

    void remove(Integer id);

    void save(Book book);

    void update(Book book);

    List<Book> findByName(String name);
}
