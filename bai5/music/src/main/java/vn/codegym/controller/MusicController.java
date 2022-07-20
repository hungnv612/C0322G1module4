package vn.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Music;
import vn.codegym.service.IMusicService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private IMusicService iMusicService;

    @GetMapping
    public ModelAndView showStudentList() {
        return new ModelAndView("list",
                "music", iMusicService.findAll());
    }

    @GetMapping("create")
    public String showCreatePage(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("create")
    public String createStudent(@ModelAttribute Music music, RedirectAttributes redirectAttributes) {

        iMusicService.save(music);
        redirectAttributes.addFlashAttribute("mess", "Create student: " + music.getNameSong() + " OK!");
        return "redirect:/";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id, Music music, RedirectAttributes redirectAttributes) {
        iMusicService.remove(iMusicService.findById(id));
        redirectAttributes.addFlashAttribute("mess", "xoa thanh cong");
        return "redirect:/";
    }

    @GetMapping("edit")
    public String showEdit(@RequestParam int id, Model model) {
        model.addAttribute("songs", iMusicService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String edit(Music music, RedirectAttributes redirectAttributes) {
        iMusicService.update(music.getId(), music);
        redirectAttributes.addFlashAttribute("mess","update ");
        return "redirect:/";
    }
}
