package com.example.demo.servivce;

import com.example.demo.entity.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAll();

    MauSac add(MauSac mauSac);

    Boolean delete(UUID id);

    MauSac update(MauSac mauSac, UUID id);

    MauSac detail(UUID id);
}
