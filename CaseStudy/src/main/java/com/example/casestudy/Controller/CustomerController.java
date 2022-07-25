package com.example.casestudy.Controller;


import com.example.casestudy.model.Customer;
import com.example.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    @GetMapping
    public String view(){
        return "home";
    }

    @GetMapping("listCustomer")
    public String showPage(Model model) {
        model.addAttribute("customer", iCustomerService.findAll());
        return "listCustomer";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iCustomerService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:listCustomer";
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "createCustomer";
    }
}
