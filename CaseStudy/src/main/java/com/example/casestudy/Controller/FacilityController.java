package com.example.casestudy.Controller;


import com.example.casestudy.service.Customer.ICustomerService;
import com.example.casestudy.service.Facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacilityController {

    @Autowired
    IFacilityService iFacilityService;

    @GetMapping("listFacility")
    public String showPage(Model model) {
        model.addAttribute("facility", iFacilityService.findAll());
        return "facility/listFacility";
    }

}
