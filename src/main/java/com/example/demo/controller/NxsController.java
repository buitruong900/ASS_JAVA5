package com.example.demo.controller;

import com.example.demo.entity.NXS;
import com.example.demo.servivce.NxsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/nxs")
public class NxsController {
    @Autowired
    private NxsService nxsService;

    @GetMapping("/hien-thi")
    public String getAll(Model model, @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                         @RequestParam(name = "pageSize", required = false, defaultValue = "5") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Page<NXS> page = nxsService.getPage(pageable);
        model.addAttribute("totalPage", page.getTotalPages());
        model.addAttribute("list", page.getContent());
        return "nxs";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute NXS nxs) {
        nxsService.add(nxs);
        return "redirect:/nxs/hien-thi";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable UUID id) {
        nxsService.delete(id);
        return "redirect:/nxs/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable UUID id, Model model) {
        NXS nxs = nxsService.detail(id);
        model.addAttribute("nxs", nxs);
        return "nxs";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute NXS nxs, @PathVariable UUID id) {
        nxsService.update(id, nxs);
        return "redirect:/nxs/hien-thi";
    }
}
