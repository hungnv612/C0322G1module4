package calcalator.controller;

import calcalator.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {

    @Autowired
    private ICaculatorService iCaculatorService;

    @GetMapping
    public String getIndex() {
        return "list";
    }

    @PostMapping("/caculator")
    public String postIndex(@RequestParam int number1, int number2, String cal, Model model) {
        model.addAttribute("total", iCaculatorService.cal(number1, number2, cal));
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        return "list";
    }
}
