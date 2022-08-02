package com.example.books.controller;


import com.example.books.model.Book;
import com.example.books.model.User;
import com.example.books.service.IBookService;
import com.example.books.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
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
    public String showCreate(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("book", iBookService.findAll());
        return "create";
    }


    @PostMapping("create")
    public String bookCreate(@ModelAttribute User user, RedirectAttributes redirectAttributes) throws Exception {
        Book book = iBookService.findById(user.getIdBook().getIdBook());
        if (book.getAmount() == 0) {
            throw new Exception();
        } else {
            book.setAmount(book.getAmount() - 1);
            iBookService.save(book);
            iUserService.save(user);
            redirectAttributes.addFlashAttribute("mess", "Create student: " + user.getNameUser() + " OK!");
        }
        return "redirect:";

    }

    @GetMapping("pay")
    public String bookPay(@RequestParam("payBook") Long code, RedirectAttributes redirectAttributes) {
        User user = iUserService.findByCodeUser(code);
        if (user == null) {
            redirectAttributes.addFlashAttribute("mess", "Mã sách không tồn tại!");
        } else {
            Book book = iBookService.findById(user.getIdBook().getIdBook());
            book.setAmount(book.getAmount() + 1);
            iUserService.remove(user.getIdUser());
            redirectAttributes.addFlashAttribute("mess", "Trả sách thành công!");
        }

        return "redirect:";
    }
    @ExceptionHandler(Exception.class)
    public String errorPage() {
        return "error";
    }
    @ExceptionHandler(NullPointerException.class)
    public String errorPage1() {
        return "error";
    }


}
