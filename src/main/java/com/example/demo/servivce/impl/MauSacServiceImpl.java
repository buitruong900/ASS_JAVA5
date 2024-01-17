package com.example.demo.servivce.impl;

import com.example.demo.entity.MauSac;
import com.example.demo.repo.MauSacRepo;
import com.example.demo.servivce.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    private MauSacRepo mauSacRepo;

    @Override
    public List<MauSac> getAll() {
        return mauSacRepo.findAll();
    }

    @Override
    public MauSac add(MauSac mauSac) {
        return mauSacRepo.save(mauSac);
    }

    @Override
    public Boolean delete(UUID id) {
        mauSacRepo.deleteById(id);
        return true;
    }

    @Override
    public MauSac update(MauSac mauSac, UUID id) {
        return mauSacRepo.save(mauSac);
    }

    @Override
    public MauSac detail(UUID id) {
        return mauSacRepo.findById(id).orElse(null);
    }
}
