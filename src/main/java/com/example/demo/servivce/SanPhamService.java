package com.example.demo.servivce;

import com.example.demo.entity.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();

    SanPham add(SanPham sanPham);

    Boolean delete(UUID id);

    SanPham update(UUID id, SanPham sanPham);

    SanPham detail(UUID id);
}
