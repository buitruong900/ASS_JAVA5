package com.example.demo.controller;

import com.example.demo.entity.HoaDon;
import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.servivce.HoaDonService;
import com.example.demo.servivce.KhachHangService;
import com.example.demo.servivce.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/hien-thi")
    private String getAllHD(Model model) {
        List<HoaDon> list = hoaDonService.getAll();
        model.addAttribute("list", list);
        List<KhachHang> listKhachHang = khachHangService.getAll();
        model.addAttribute("listKhachHang", listKhachHang);
        List<NhanVien> listNhanVien = nhanVienService.getAll();
        model.addAttribute("listNhanVien", listNhanVien);
        return "hoadon";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute HoaDon hoaDon) {
        hoaDonService.add(hoaDon);
        return "redirect:/hoa-don/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        hoaDonService.delete(id);
        return "redirect:/hoa-don/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        HoaDon hoaDon = hoaDonService.detail(id);
        List<KhachHang> listKhachHang = khachHangService.getAll();
        List<NhanVien> listNhanVien = nhanVienService.getAll();
        model.addAttribute("hoaDon", hoaDon);
        model.addAttribute("listKhachHang", listKhachHang);
        model.addAttribute("listNhanVien", listNhanVien);
        return "hoadon";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute HoaDon hoaDon) {
        hoaDonService.update(id, hoaDon);
        return "redirect:/hoa-don/hien-thi";
    }


}
