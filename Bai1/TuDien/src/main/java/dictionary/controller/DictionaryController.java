package dictionary.controller;

import dictionary.repository.IDictionaryRepository;
import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping
    public String view() {
        return "list";
    }

    @PostMapping("/dictionary")
    public ModelAndView currency(@RequestParam String txtSearch,ModelAndView modelAndView) {
        modelAndView = new ModelAndView("list","result", iDictionaryService.Dictionary(txtSearch));
        return modelAndView;
    }

}
