package com.example.demo.servivce;

import com.example.demo.entity.KhachHang;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();

    KhachHang add(KhachHang khachHang);

    Boolean delete(UUID id);

    KhachHang update(UUID id, KhachHang khachHang);

    KhachHang detail(UUID id);
}
