package com.example.demo.controller;

import com.example.demo.entity.CuaHang;
import com.example.demo.repo.CuaHangRepo;
import com.example.demo.servivce.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {
    @Autowired
    private CuaHangService cuaHangService;

    @GetMapping("/hien-thi")
    public String getAllCuaHang(Model model) {
        List<CuaHang> list = cuaHangService.getAll();
        model.addAttribute("list", list);
        return "index";
//        list.forEach(x-> System.out.println(x.toString()));
//        CuaHang cuaHang=new CuaHang();
//        cuaHang.setMa("CH03");
//        cuaHang.setTen("son ban ca");
//        cuaHang.setDia_chi("Bac giang");
//        cuaHang.setThanh_pho("Bac giang");
//        cuaHang.setQuoc_gia("viet nam");
//
//        cuaHangService.add(cuaHang);
    }

    @PostMapping("/add")
    public String add(@ModelAttribute CuaHang cuaHang) {
        cuaHangService.add(cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        cuaHangService.delete(id);
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        CuaHang cuaHang = cuaHangService.findById(id);
        model.addAttribute("cuaHang", cuaHang);
        return "detail";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable UUID id,
                         @ModelAttribute CuaHang cuaHang) {
        cuaHangService.update(id, cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }
}
