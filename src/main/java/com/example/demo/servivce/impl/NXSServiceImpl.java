package com.example.demo.servivce.impl;


import com.example.demo.entity.NXS;
import com.example.demo.repo.NXSRepo;
import com.example.demo.servivce.NxsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NXSServiceImpl implements NxsService {
    @Autowired
    NXSRepo nxsRepo;

    @Override
    public Page<NXS> getPage(Pageable pageable) {
        return nxsRepo.findAll(pageable);
    }

    @Override
    public NXS add(NXS nxs) {
        return nxsRepo.save(nxs);
    }

    @Override
    public Boolean delete(UUID id) {
        nxsRepo.deleteById(id);
        return true;
    }

    @Override
    public NXS detail(UUID id) {
        return nxsRepo.findById(id).orElse(null);
    }

    @Override
    public NXS update(UUID id, NXS nxs) {
        return nxsRepo.save(nxs);
    }
}
