package sandwich.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sandwich.service.ISandwichServive;

@Controller
public class SandwichController {

    @Autowired
    private ISandwichServive iSandwichServive;


    @GetMapping
    public String getIndex() {
        return "list";
    }

    @PostMapping("/sandwich")
    public String postIndex(@RequestParam(defaultValue = "") String[] condiment, Model model) {
        String mess = iSandwichServive.returnChose(condiment);
        model.addAttribute("mess", mess);
        return "list";
    }


}
