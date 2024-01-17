package com.example.demo.controller;

import com.example.demo.entity.DongSP;
import com.example.demo.servivce.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/dong-sp")
public class DongSPController {
    @Autowired
    private DongSPService dongSPService;

    @GetMapping("/hien-thi")
    public String getAllDongSP(Model model, @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Page<DongSP> list = dongSPService.getPage(pageable);
        model.addAttribute("totalPage", list.getTotalPages());
        model.addAttribute("list", list.getContent());
        return "dongsp";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute DongSP dongSP) {
        dongSPService.add(dongSP);
        return "redirect:/dong-sp/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        dongSPService.delete(id);
        return "redirect:/dong-sp/hien-thi";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute DongSP dongSP) {
        dongSPService.update(id, dongSP);
        return "redirect:/dong-sp/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        DongSP dongSP = dongSPService.detail(id);
        model.addAttribute("dongSP", dongSP);
        return "dongsp";
    }

}
