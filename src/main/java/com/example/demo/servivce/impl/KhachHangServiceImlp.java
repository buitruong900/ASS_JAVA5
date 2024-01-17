package com.example.demo.servivce.impl;

import com.example.demo.entity.KhachHang;
import com.example.demo.repo.KhachHangRepo;
import com.example.demo.servivce.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KhachHangServiceImlp implements KhachHangService {
    @Autowired
    private KhachHangRepo khachHangRepo;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepo.findAll();
    }

    @Override
    public KhachHang add(KhachHang khachHang) {
        return khachHangRepo.save(khachHang);
    }

    @Override
    public Boolean delete(UUID id) {
        khachHangRepo.deleteById(id);
        return true;
    }

    @Override
    public KhachHang update(UUID id, KhachHang khachHang) {
        return khachHangRepo.save(khachHang);
    }

    @Override
    public KhachHang detail(UUID id) {
        return khachHangRepo.findById(id).orElse(null);
    }
}
