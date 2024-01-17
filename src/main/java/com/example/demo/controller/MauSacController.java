package com.example.demo.controller;

import com.example.demo.entity.MauSac;
import com.example.demo.servivce.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public String getAllMauSac(Model model) {
        List<MauSac> list = mauSacService.getAll();
        model.addAttribute("list", list);
        return "mausac";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute MauSac mauSac) {
        mauSacService.add(mauSac);
        return "redirect:/mau-sac/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        mauSacService.delete(id);
        return "redirect:/mau-sac/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        MauSac mauSac = mauSacService.detail(id);
        model.addAttribute("mauSac", mauSac);
        return "mausac";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute MauSac mauSac) {
        mauSacService.update(mauSac, id);
        return "redirect:/mau-sac/hien-thi";
    }
}
