package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;


    @GetMapping
    public String showPage(Model model, @PageableDefault(value = 3, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        model.addAttribute("blog", iBlogService.findAll(pageable));
        return "list";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iBlogService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:";
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("create")
    public String createStudent(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("mess", "Create student: " + blog.getNameBlog() + " OK!");
        return "redirect:";
    }

    @GetMapping("edit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "edit";
    }
    @PostMapping("edit")
    public String edit(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.update(blog);
        redirectAttributes.addFlashAttribute("mess","update thanh cong ");
        return "redirect:";
    }
    @GetMapping("search")
    public String search(@RequestParam String keyword, Model model){
        List<Blog> blogList = iBlogService.findByName(keyword);
        model.addAttribute("blog",blogList);
        return "list";
    }
}
