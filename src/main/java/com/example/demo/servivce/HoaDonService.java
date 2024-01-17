package com.example.demo.servivce;

import com.example.demo.entity.HoaDon;

import java.util.List;
import java.util.UUID;

public interface HoaDonService {
    List<HoaDon> getAll();

    HoaDon add(HoaDon hoaDon);

    Boolean delete(UUID id);

    HoaDon update(UUID id, HoaDon hoaDon);

    HoaDon detail(UUID id);
}
