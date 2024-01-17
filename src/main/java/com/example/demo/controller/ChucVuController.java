package com.example.demo.controller;
import com.example.demo.entity.ChucVu;
import com.example.demo.servivce.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chuc-vu")
public class ChucVuController {
    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String getAllChucVu(Model model) {
        List<ChucVu> list = chucVuService.getAll();
        model.addAttribute("list", list);
        return "chucvu";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute ChucVu chucVu) {
        chucVuService.add(chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        chucVuService.delete(id);
        return "redirect:/chuc-vu/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        ChucVu chucVu = chucVuService.detail(id);
        model.addAttribute("chucVu", chucVu);
        return "chucvu";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id,
                         @ModelAttribute ChucVu chucVu) {
        chucVuService.update(id, chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }

}
