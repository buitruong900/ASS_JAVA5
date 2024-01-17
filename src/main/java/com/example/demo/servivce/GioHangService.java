package com.example.demo.servivce;

import com.example.demo.entity.GioHang;

import java.util.List;
import java.util.UUID;

public interface GioHangService {
    List<GioHang> getAll();

    GioHang add(GioHang gioHang);

    Boolean delete(UUID id);

    GioHang update(GioHang gioHang, UUID id);

    GioHang detail(UUID id);
}
