package com.example.demo.servivce.impl;

import com.example.demo.entity.HoaDonChiTiet;
import com.example.demo.repo.HoaDonChiTietRepo;
import com.example.demo.servivce.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {
    @Autowired
    private HoaDonChiTietRepo hoaDonChiTietRepo;

    @Override
    public List<HoaDonChiTiet> getAll() {
        return hoaDonChiTietRepo.findAll();
    }

    @Override
    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet) {
        return hoaDonChiTietRepo.save(hoaDonChiTiet);
    }

    @Override
    public Boolean delete(UUID id) {
//        hoaDonChiTietRepo.deleteById(id);
        return true;
    }

    @Override
    public HoaDonChiTiet update(HoaDonChiTiet hoaDonChiTiet, UUID id) {
        return hoaDonChiTietRepo.save(hoaDonChiTiet);
    }

    @Override
    public HoaDonChiTiet detail(UUID id) {
        return null;
    }
}
