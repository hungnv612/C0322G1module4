package com.example.books.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @ManyToOne
    @JoinColumn(name ="idBook",referencedColumnName = "idBook")
    private Book idBook;

    private String nameUser;
    private Long codeUser;

    public User() {
    }

    public User(int idUser, Book idBook, String nameUser, Long codeUser) {
        this.idUser = idUser;
        this.idBook = idBook;
        this.nameUser = nameUser;
        this.codeUser = codeUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Book getIdBook() {
        return idBook;
    }

    public void setIdBook(Book idBook) {
        this.idBook = idBook;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Long getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(Long codeUser) {
        this.codeUser = codeUser;
    }
}
