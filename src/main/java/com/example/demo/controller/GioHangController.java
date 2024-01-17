package com.example.demo.controller;

import com.example.demo.entity.GioHang;
import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.servivce.GioHangService;
import com.example.demo.servivce.KhachHangService;
import com.example.demo.servivce.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/gio-hang")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/hien-thi")
    public String getAllGH(Model model) {
        List<GioHang> list = gioHangService.getAll();
        model.addAttribute("list", list);
        List<KhachHang> listKhachHang = khachHangService.getAll();
        model.addAttribute("listKhachHang", listKhachHang);
        List<NhanVien> listNhanVien = nhanVienService.getAll();
        model.addAttribute("listNhanVien", listNhanVien);
        return "giohang";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute GioHang gioHang) {
        gioHangService.add(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        gioHangService.delete(id);
        return "redirect:/gio-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    private String detail(@PathVariable UUID id, Model model) {
        GioHang gioHang = gioHangService.detail(id);
        List<KhachHang> listKhachHang = khachHangService.getAll();
        List<NhanVien> listNhanVien = nhanVienService.getAll();
        model.addAttribute("gioHang", gioHang);
        model.addAttribute("listKhachHang", listKhachHang);
        model.addAttribute("listNhanVien", listNhanVien);
        return "giohang";
    }

    @PostMapping("/update/{id}")
    private String update(@ModelAttribute GioHang gioHang, @PathVariable UUID id) {
        gioHangService.update(gioHang, id);
        return "redirect:/gio-hang/hien-thi";
    }
}
