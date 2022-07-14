package currency.controller;


import currency.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class curencyController {
    private static final String NUMBER_REGEX = "^/^[0-9]+$/', '123";



 @Autowired
private ICurrencyService iCurrencyService;

 @GetMapping
public String show(){
    return "list";
}
@PostMapping("/Change")
public ModelAndView moneyChange(@RequestParam(defaultValue = "0") double usd  ,@RequestParam(defaultValue = "0") double rate , ModelAndView modelAndView ){
 modelAndView = new ModelAndView("list","vnd",iCurrencyService.change(usd,rate));
return modelAndView;
}

}
