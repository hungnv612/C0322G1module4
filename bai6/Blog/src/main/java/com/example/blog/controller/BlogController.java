package com.example.blog.controller;

import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;


    @GetMapping
    public ModelAndView showList() {
        return new ModelAndView("list",
                "blog", iBlogService.findAll());
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iBlogService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:/";
    }
}
