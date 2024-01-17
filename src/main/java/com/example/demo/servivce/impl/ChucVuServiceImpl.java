package com.example.demo.servivce.impl;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.CuaHang;
import com.example.demo.repo.ChucVuRepo;
import com.example.demo.servivce.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    private ChucVuRepo chucVuRepo;

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepo.findAll();
    }

    @Override
    public ChucVu add(ChucVu chucVu) {
        return chucVuRepo.save(chucVu);
    }

    @Override
    public Boolean delete(UUID id) {
        this.chucVuRepo.deleteById(id);
        return true;
    }

    @Override
    public ChucVu detail(UUID id) {
        ChucVu chucVu = chucVuRepo.findById(id).get();
        return chucVu;
    }

    @Override
    public ChucVu update(UUID id, ChucVu chucVu) {
        chucVuRepo.save(chucVu);
        return null;
    }
}
