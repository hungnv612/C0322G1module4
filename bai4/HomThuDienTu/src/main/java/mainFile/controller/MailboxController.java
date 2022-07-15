package mainFile.controller;


import mainFile.model.Mailbox;
import mainFile.service.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MailboxController {

    @Autowired
    IMailboxService iMailboxService;

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showForm(Model model) {
//        model.addAttribute("mailbox", new Mailbox());
//        return "list";
//    }

//    @RequestMapping(value = "edit", method = RequestMethod.GET)
//    public String showFormEdit(Model model) {
//        model.addAttribute("mailbox", iMailboxService.returnMailboxList());
//        return "list";
//    }



}
