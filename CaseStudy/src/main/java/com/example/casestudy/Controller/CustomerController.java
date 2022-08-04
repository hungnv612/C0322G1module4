package com.example.casestudy.Controller;


import com.example.casestudy.DTO.CustomerDTO;
import com.example.casestudy.model.CustomerModel.Customer;
import com.example.casestudy.service.Customer.ICustomerService;
import com.example.casestudy.service.Customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerTypeService iCustomerTypeService;


    @GetMapping("listCustomer")
    public String showPage(Model model, @PageableDefault(value = 3,  sort = "customerId", direction = Sort.Direction.ASC) Pageable pageable) {
        model.addAttribute("customer", iCustomerService.findAll(pageable));
        return "customer/listCustomer";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iCustomerService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:customer/listCustomer";
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("customerDto", new CustomerDTO());
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        return "customer/createCustomer";
    }

    @PostMapping("create")
    public String createStudent(@Valid @ModelAttribute("customerDto") CustomerDTO customerDTO, BindingResult  bindingResult ,RedirectAttributes redirectAttributes,Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType", iCustomerTypeService.findAll());
            return "customer/createCustomer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "Create student: " + customer.getCustomerName() + " OK!");
        return "redirect:listCustomer";
    }

    @GetMapping("edit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("customerDto", iCustomerService.findById(id));
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        return "customer/editCustomer";
    }

    @PostMapping("edit")
    public String edit(@Valid @ModelAttribute("customerDto") CustomerDTO customerDTO, BindingResult  bindingResult ,RedirectAttributes redirectAttributes,Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType", iCustomerTypeService.findAll());
            return "customer/createCustomer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "update thành công");
        return "redirect:listCustomer";
    }

    @GetMapping("search")
    public String search(@RequestParam String keyword, Model model,Pageable pageable){
        Page<Customer> customerList = iCustomerService.findByName(keyword,pageable);
        model.addAttribute("customer",customerList);
        return "customer/listCustomer";
    }
}
