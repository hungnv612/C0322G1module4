package com.example.casestudy.Controller;


import com.example.casestudy.model.FacilityMode.Facility;
import com.example.casestudy.service.Facility.IFacilityService;
import com.example.casestudy.service.Facility.IFacilityTypeService;
import com.example.casestudy.service.Facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FacilityController {

    @Autowired
    IFacilityService iFacilityService;

    @Autowired
    IFacilityTypeService iFacilityTypeService;

    @Autowired
    IRentTypeService iRentTypeService;

    @GetMapping("listFacility")
    public String showPage(Model model, @PageableDefault(value = 3,  sort = "facilityId", direction = Sort.Direction.ASC) Pageable pageable) {
        model.addAttribute("facility", iFacilityService.findAll(pageable));
        return "facility/listFacility";
    }

    @GetMapping("createFacility")
    public String showCreate(Model model) {
        model.addAttribute("facilityType", iFacilityTypeService.findAll());
        model.addAttribute("rentType", iRentTypeService.findAll());
        model.addAttribute("facility", new Facility());
        return "facility/createFacility";
    }

    @PostMapping("createFacility")
    public String createStudent(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "Create student: " + facility.getFacilityName() + " OK!");
        return "redirect:listFacility";
    }
    @GetMapping("deleteFacility")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iFacilityService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:listFacility";
    }
    @GetMapping("editFacility")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("facility", iFacilityService.findById(id));
        model.addAttribute("facilityType", iFacilityTypeService.findAll());
        model.addAttribute("rentType", iRentTypeService.findAll());
        return "facility/editFacility";
    }

    @PostMapping("editFacility")
    public String edit(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess","update thanh cong ");
        return "redirect:/listFacility";
    }


    @GetMapping("searchFacility")
    public String search(@RequestParam String keyword, Model model,Pageable pageable){
        Page<Facility> facilityList = iFacilityService.findByName(keyword,pageable);
        model.addAttribute("facility",facilityList);
        return "facility/listFacility";
    }
}
