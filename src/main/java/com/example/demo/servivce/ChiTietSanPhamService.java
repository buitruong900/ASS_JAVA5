package com.example.demo.servivce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.example.demo.entity.Cart;
import com.example.demo.entity.ChiTietSanPham;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getAll();

    ChiTietSanPham add(ChiTietSanPham chiTietSanPham);

    Boolean delete(UUID id);

    ChiTietSanPham detail(UUID id);

    ChiTietSanPham update(ChiTietSanPham chiTietSanPham, UUID id);

    ChiTietSanPham clear();
}
