package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.CuaHang;
import com.example.demo.entity.NhanVien;
import com.example.demo.servivce.ChucVuService;
import com.example.demo.servivce.CuaHangService;
import com.example.demo.servivce.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private CuaHangService cuaHangService;
    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String getAllNV(Model model) {
        List<NhanVien> list = nhanVienService.getAll();
        model.addAttribute("list", list);
        List<CuaHang> list1 = cuaHangService.getAll();
        model.addAttribute("listCuaHang", list1);
        List<ChucVu> list2 = chucVuService.getAll();
        model.addAttribute("listChucVu", list2);
        return "nhanvien";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute NhanVien nhanVien) {
        nhanVienService.add(nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        nhanVienService.delete(id);
        return "redirect:/nhan-vien/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        NhanVien nhanVien = nhanVienService.detail(id);
        List<CuaHang> listCuaHang = cuaHangService.getAll();
        List<ChucVu> listChucVu = chucVuService.getAll();
        model.addAttribute("nhanVien", nhanVien);
        model.addAttribute("listCuaHang", listCuaHang);
        model.addAttribute("listChucVu", listChucVu);
        return "nhanvien";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id, @ModelAttribute NhanVien nhanVien) {
        nhanVienService.update(id, nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }


}
