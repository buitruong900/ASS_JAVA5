package com.example.demo.servivce.impl;

import com.example.demo.entity.DongSP;
import com.example.demo.repo.DongSPRepo;
import com.example.demo.servivce.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DongSPServiceImpl implements DongSPService {
    @Autowired
    private DongSPRepo dongSPRepo;


    @Override
    public Page<DongSP> getPage(Pageable pageable) {
        return dongSPRepo.findAll(pageable);
    }

    @Override
    public DongSP add(DongSP dongSP) {
        return dongSPRepo.save(dongSP);
    }

    @Override
    public Boolean delete(UUID id) {
        this.dongSPRepo.deleteById(id);
        return true;
    }

    @Override
    public DongSP update(UUID id, DongSP dongSP) {
        return dongSPRepo.save(dongSP);
    }

    @Override
    public DongSP detail(UUID id) {
        return dongSPRepo.findById(id).orElse(null);
    }
}
