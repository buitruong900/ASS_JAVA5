package com.example.demo.servivce.impl;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ChiTietSanPham;
import com.example.demo.repo.ChiTietSanPhamRepo;
import com.example.demo.servivce.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepo chiTietSanPhamRepo;

    @Override
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepo.findAll();
    }

    @Override
    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepo.save(chiTietSanPham);
    }

    @Override
    public Boolean delete(UUID id) {
        this.chiTietSanPhamRepo.deleteById(id);
        return true;
    }

    @Override
    public ChiTietSanPham detail(UUID id) {
        return chiTietSanPhamRepo.findById(id).orElse(null);
    }

    @Override
    public ChiTietSanPham update(ChiTietSanPham chiTietSanPham, UUID id) {
        return chiTietSanPhamRepo.save(chiTietSanPham);
    }

    @Override
    public ChiTietSanPham clear() {
        return null;
    }

}
