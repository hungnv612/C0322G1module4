package com.example.books.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @OneToMany(mappedBy = "idBook", cascade = CascadeType.ALL)
    private Set<Book> books;

    private String nameUser;
    private int codeUser;

    public User() {
    }

    public User(int idUser, Set<Book> books, String nameUser, int codeUser) {
        this.idUser = idUser;
        this.books = books;
        this.nameUser = nameUser;
        this.codeUser = codeUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }
}
