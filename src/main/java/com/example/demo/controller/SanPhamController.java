package com.example.demo.controller;

import com.example.demo.entity.SanPham;
import com.example.demo.servivce.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/hien-thi")
    public String getAllSP(Model model) {
        List<SanPham> list = sanPhamService.getAll();
        model.addAttribute("list", list);
        return "sanpham";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute SanPham sanPham) {
        sanPhamService.add(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        sanPhamService.delete(id);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        SanPham sanPham = sanPhamService.detail(id);
        model.addAttribute("sanPham", sanPham);
        return "sanpham";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute SanPham sanPham) {
        sanPhamService.update(id, sanPham);
        return "redirect:/san-pham/hien-thi";
    }
//    @Scheduled(fixedDelay = 5000)
//    void check(){
//        System.out.println("xin chao");
//    }
}
