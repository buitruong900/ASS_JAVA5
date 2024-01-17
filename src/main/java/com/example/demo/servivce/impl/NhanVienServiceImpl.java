package com.example.demo.servivce.impl;

import com.example.demo.entity.NhanVien;
import com.example.demo.repo.NhanVienRepo;
import com.example.demo.servivce.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    private NhanVienRepo nhanVienRepo;

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepo.findAll();
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepo.save(nhanVien);
    }

    @Override
    public Boolean delete(UUID id) {
        nhanVienRepo.deleteById(id);
        return true;
    }

    @Override
    public NhanVien update(UUID id, NhanVien nhanVien) {
        return nhanVienRepo.save(nhanVien);
    }

    @Override
    public NhanVien detail(UUID id) {
        return nhanVienRepo.findById(id).orElse(null);
    }
}
