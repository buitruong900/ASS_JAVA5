package com.example.demo.controller;

import com.example.demo.entity.MauSac;
import com.example.demo.entity.SanPham;
import com.example.demo.servivce.ChiTietSanPhamService;
import com.example.demo.servivce.MauSacService;
import com.example.demo.servivce.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.ChiTietSanPham;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/chi-tiet-san-pham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public String getAll(Model model) {
        List<ChiTietSanPham> list = chiTietSanPhamService.getAll();
        model.addAttribute("list", list);
        List<SanPham> listSanPham = sanPhamService.getAll();
        model.addAttribute("listSanPham", listSanPham);
        List<MauSac> listMauSac = mauSacService.getAll();
        model.addAttribute("listMauSac", listMauSac);
        return "chi-tiet-sp";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamService.add(chiTietSanPham);
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        chiTietSanPhamService.delete(id);
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.detail(id);
        model.addAttribute("chiTietSanPham", chiTietSanPham);
        List<SanPham> listSanPham = sanPhamService.getAll();
        model.addAttribute("listSanPham", listSanPham);
        List<MauSac> listMauSac = mauSacService.getAll();
        model.addAttribute("listMauSac", listMauSac);
        return "chi-tiet-sp";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute ChiTietSanPham chiTietSanPham, @PathVariable UUID id) {
        chiTietSanPhamService.update(chiTietSanPham, id);
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }
}
