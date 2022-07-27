package com.example.books.service;

import com.example.books.model.Book;
import com.example.books.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService implements IBookService {

    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return iBookRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public void update(Book book) {
        iBookRepository.updateId(book.getAmount(), book.getIdBook());
    }

    @Override
    public List<Book> findByName(String name) {
        return null;
    }
}
