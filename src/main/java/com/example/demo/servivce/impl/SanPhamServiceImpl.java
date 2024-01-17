package com.example.demo.servivce.impl;

import com.example.demo.entity.SanPham;
import com.example.demo.repo.SanPhamRepo;
import com.example.demo.servivce.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepo sanPhamRepo;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepo.findAll();
    }

    @Override
    public SanPham add(SanPham sanPham) {
        return sanPhamRepo.save(sanPham);
    }

    @Override
    public Boolean delete(UUID id) {
        sanPhamRepo.deleteById(id);
        return true;
    }

    @Override
    public SanPham update(UUID id, SanPham sanPham) {
        return sanPhamRepo.save(sanPham);
    }

    @Override
    public SanPham detail(UUID id) {
        return sanPhamRepo.findById(id).orElse(null);
    }


}
