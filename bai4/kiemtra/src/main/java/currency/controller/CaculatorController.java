package currency.controller;

import currency.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {

    @Autowired
    private  ICaculatorService iCaculatorService;

    @GetMapping
    public String view() {
        return "list";
    }

    @PostMapping
    public String total(@RequestParam(defaultValue = "0")float number1 ,@RequestParam(defaultValue = "0") float number2, String sign , Model model){
         float result = iCaculatorService.result(number1,number2,sign);
         model.addAttribute("result", result);
         model.addAttribute("number1", number1);
         model.addAttribute("number2", number2);
         return "list";
    }

}
