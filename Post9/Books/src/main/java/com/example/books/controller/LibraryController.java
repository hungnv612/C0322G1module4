package com.example.books.controller;


import com.example.books.model.Book;
import com.example.books.model.User;
import com.example.books.service.IBookService;
import com.example.books.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class LibraryController {

    @Autowired
    IBookService iBookService;

    @Autowired
    IUserService iUserService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("book", iBookService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreate(Model model ) {
        model.addAttribute("user", new User());
        model.addAttribute("book", iBookService.findAll());
        return "create";
    }



    @PostMapping("create")
    public String createStudent(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        Book book = iBookService.findById(user.getIdBook().getIdBook());
        if (book.getAmount() == 0){
            redirectAttributes.addFlashAttribute("mess", "mượn thất bại sách đã hết");
        }else {
            book.setAmount(book.getAmount()-1);
            iBookService.save(book);
            iUserService.save(user);
            redirectAttributes.addFlashAttribute("mess", "Create student: " + user.getNameUser() + " OK!");
        }
        return "redirect:";

    }



}
