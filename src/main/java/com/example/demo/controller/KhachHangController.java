package com.example.demo.controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.servivce.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/hien-thi")
    public String getAllKH(Model model) {
        List<KhachHang> list = khachHangService.getAll();
        model.addAttribute("list", list);
        return "khachhang";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute KhachHang khachHang) {
        khachHangService.add(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        khachHangService.delete(id);
        return "redirect:/khach-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        KhachHang khachHang = khachHangService.detail(id);
        model.addAttribute("khachHang", khachHang);
        return "khachhang";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute KhachHang khachHang) {
        khachHangService.update(id, khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
}
