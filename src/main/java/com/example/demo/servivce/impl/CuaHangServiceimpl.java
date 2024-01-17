package com.example.demo.servivce.impl;

import com.example.demo.entity.CuaHang;
import com.example.demo.repo.CuaHangRepo;
import com.example.demo.servivce.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CuaHangServiceimpl implements CuaHangService {
    @Autowired
    private CuaHangRepo cuaHangRepo;

    @Override
    public List<CuaHang> getAll() {
        return cuaHangRepo.findAll();
    }

    @Override
    public CuaHang add(CuaHang cuaHang) {
        return cuaHangRepo.save(cuaHang);
    }

    @Override
    public Boolean delete(UUID id) {
        this.cuaHangRepo.deleteById(id);
        return true;
    }

    @Override
    public CuaHang findById(UUID id) {
        return cuaHangRepo.findById(id).orElse(null);
    }

    @Override
    public CuaHang update(UUID id, CuaHang cuaHang) {
        cuaHangRepo.save(cuaHang);
        return null;
    }


}
