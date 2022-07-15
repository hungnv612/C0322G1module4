package totalFile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import totalFile.service.IProductService;

@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping
    public String showIndex(Model model) {
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }

}
