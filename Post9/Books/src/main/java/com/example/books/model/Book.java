package com.example.books.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;


    @OneToMany(mappedBy = "idBook", cascade = CascadeType.ALL)
    private Set<User> idUser;

    private String nameBook;
    private int amount;

    public Book() {
    }

    public Book(int idBook, Set<User> idUser, String nameBook, int amount) {
        this.idBook = idBook;
        this.idUser = idUser;
        this.nameBook = nameBook;
        this.amount = amount;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Set<User> getIdUser() {
        return idUser;
    }

    public void setIdUser(Set<User> idUser) {
        this.idUser = idUser;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
