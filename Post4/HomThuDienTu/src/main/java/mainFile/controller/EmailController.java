package mainFile.controller;


import mainFile.model.Email;
import mainFile.service.EmailService;
import mainFile.service.LanguageService;
import mainFile.service.PageSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;

    @Autowired
    PageSizeService pageSizeService;

    @Autowired
    LanguageService languageService;

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("display");
        List<Email> emailList = emailService.findAll();
        modelAndView.addObject("emailList", emailList);
        return modelAndView;
    }

    @GetMapping("/update")
    public ModelAndView showUpdate(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("email", emailService.findOne(id));
        modelAndView.addObject("languageArr", languageService.showAll());
        modelAndView.addObject("pageSizeArr", pageSizeService.showAll());
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateEmail(@ModelAttribute("email") Email email) {
        emailService.save(email.getId(), email);
        return "redirect:/display";
    }
}
