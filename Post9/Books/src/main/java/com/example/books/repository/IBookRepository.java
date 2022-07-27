package com.example.books.repository;

import com.example.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBookRepository extends JpaRepository<Book,Integer> {

    @Modifying
    @Query(value = "update user set amount = :amount-1 where id = :id", nativeQuery = true)
    void updateId(@Param("amount") int amount, @Param("id") int id);

}
