package com.example.demo.servivce.impl;

import com.example.demo.entity.GioHang;
import com.example.demo.repo.GioHangRepo;
import com.example.demo.servivce.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GioHangRepo gioHangRepo;

    @Override
    public List<GioHang> getAll() {
        return gioHangRepo.findAll();
    }

    @Override
    public GioHang add(GioHang gioHang) {
        return gioHangRepo.save(gioHang);
    }

    @Override
    public Boolean delete(UUID id) {
        this.gioHangRepo.deleteById(id);
        return true;
    }

    @Override
    public GioHang update(GioHang gioHang, UUID id) {
        return gioHangRepo.save(gioHang);
    }

    @Override
    public GioHang detail(UUID id) {
        return gioHangRepo.findById(id).orElse(null);
    }
}
