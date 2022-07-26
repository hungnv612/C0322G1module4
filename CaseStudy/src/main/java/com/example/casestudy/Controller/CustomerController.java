package com.example.casestudy.Controller;


import com.example.casestudy.model.Customer;
import com.example.casestudy.service.ICustomerService;
import com.example.casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping
    public String view() {
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
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        return "createCustomer";
    }

    @PostMapping("create")
    public String createStudent(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "Create student: " + customer.getCustomerName() + " OK!");
        return "redirect:listCustomer";
    }

    @GetMapping("edit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("customer", iCustomerService.findById(id));
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        return "editCustomer";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute  Customer customer, RedirectAttributes redirectAttributes) {
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("mess","update thanh cong ");
        return "redirect:listCustomer";
    }

    @GetMapping("search")
    public String search(@RequestParam String keyword, Model model){
        List<Customer> customerList = iCustomerService.findByName(keyword);
        model.addAttribute("customer",customerList);
        return "listCustomer";
    }
}
