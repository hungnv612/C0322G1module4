package mainFile.controller;


import mainFile.model.Declaration;
import mainFile.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class DeclarationController {
    @Autowired
    DeclarationService declarationService;

    @Autowired
    FiveService fiveService;
    @Autowired
    DateStarService dateStarService;
    @Autowired
    DateEndService dateEndService;
    @Autowired
    VehicleService vehicleService;
    @Autowired
    WentToService wentToService;


    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("display");
        List<Declaration> allList = declarationService.findAll();
        modelAndView.addObject("allList", allList);
        return modelAndView;
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("declaration", new Declaration());
        model.addAttribute("five", fiveService.findAll());
        model.addAttribute("dateStar", dateStarService.findAll());
        model.addAttribute("dateEnd", dateEndService.findAll());
        model.addAttribute("vehicle", vehicleService.findAll());
        model.addAttribute("wentTo", wentToService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String saveProduct(Declaration declaration, RedirectAttributes redirect) {
        declarationService.save(declaration);
        redirect.addFlashAttribute("mess", "thêm thành công");
        return "redirect:/";
    }

    @GetMapping("/update")
    public ModelAndView showUpdate(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("declaration", declarationService.findById(id));
        modelAndView.addObject("five", fiveService.findAll());
        modelAndView.addObject("dateStar", dateStarService.findAll());
        modelAndView.addObject("dateEnd", dateEndService.findAll());
        modelAndView.addObject("vehicle", vehicleService.findAll());
        modelAndView.addObject("wentTo", wentToService.findAll());
        return modelAndView;
    }
    @PostMapping("/update")
    public String updateEmail(@ModelAttribute("declaration") Declaration declaration) {
        declarationService.update(declaration.getId(),declaration);
        return "redirect:/display";
    }
}
