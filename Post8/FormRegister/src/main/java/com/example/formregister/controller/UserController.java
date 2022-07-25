package com.example.formregister.controller;

import com.example.formregister.dto.UserDto;
import com.example.formregister.model.User;
import com.example.formregister.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    IUserService iUserService;


    @GetMapping("result")
    public String showPage(Model model) {
        model.addAttribute("user", iUserService.findAll());
        return "/result";
    }


    @GetMapping
    public String form(Model model){
        model.addAttribute("user",new UserDto());
        return "/form";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("user")UserDto userDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,Model model){
        if(bindingResult.hasErrors()){
            return "/form";
        }
        else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            iUserService.create(user);
            model.addAttribute("user", iUserService.findAll());
            redirectAttributes.addFlashAttribute("mess","Welcome" + user.getFirstName() + " " + user.getLastName());
            return "/result";
        }
    }
}
