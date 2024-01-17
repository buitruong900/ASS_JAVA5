package com.example.demo.servivce.impl;

import com.example.demo.entity.HoaDon;
import com.example.demo.repo.HoaDonRepo;
import com.example.demo.servivce.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    private HoaDonRepo hoaDonRepo;

    @Override
    public List<HoaDon> getAll() {
        return hoaDonRepo.findAll();
    }

    @Override
    public HoaDon add(HoaDon hoaDon) {
        return hoaDonRepo.save(hoaDon);
    }

    @Override
    public Boolean delete(UUID id) {
        this.hoaDonRepo.deleteById(id);
        return true;
    }

    @Override
    public HoaDon update(UUID id, HoaDon hoaDon) {
        return hoaDonRepo.save(hoaDon);
    }

    @Override
    public HoaDon detail(UUID id) {
        HoaDon hoaDon = hoaDonRepo.findById(id).get();
        return hoaDon;
    }
}
