package totalFile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import totalFile.model.Product;
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


    @GetMapping("edit")
    public ModelAndView showEdit(@RequestParam int id,ModelAndView modelAndView ){
        modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product", iProductService.findById(id));
        return modelAndView;
    }
    @PostMapping("edit")
    public String updateEmail(@ModelAttribute("product") Product product) {
        iProductService.update(product.getId(), product);
        return "redirect:/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam int id,Product product, RedirectAttributes redirect) {
        iProductService.findById(id);
        iProductService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");

        return "redirect:/list";
    }
}
