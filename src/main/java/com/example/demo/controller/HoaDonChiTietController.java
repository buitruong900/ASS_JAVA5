package com.example.demo.controller;

import com.example.demo.repo.HoaDonChiTietRepo;
import com.example.demo.servivce.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.HoaDonChiTiet;

import java.util.List;

@Controller
@RequestMapping("/")
public class HoaDonChiTietController {
    @Autowired
    private HoaDonChiTietService hoaDonChiTietService;

    @GetMapping()
    private String test(Model model) {
        List<HoaDonChiTiet> list = hoaDonChiTietService.getAll();
        model.addAttribute("list", list);
        return "hoa-don-chi-tiet";
    }
}
