package currency_exchange.controller;

import currency_exchange.repository.ICurrencyRepository;
import currency_exchange.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @Autowired
    private ICurrencyService iCurrencyService;

        @GetMapping
        public String view(){
            return "list";
        }

    @PostMapping ("/currency")
    public ModelAndView currency(@RequestParam float rate, float usd, Model model) {
        ModelAndView modelAndView = new ModelAndView("list","vnd", iCurrencyService.Currency(rate,usd));
        return modelAndView;
    }

}
