package com.example.demo.servivce;

import com.example.demo.entity.CuaHang;

import java.util.List;
import java.util.UUID;

public interface CuaHangService {
    List<CuaHang> getAll();

    CuaHang add(CuaHang cuaHang);

    Boolean delete(UUID id);

    CuaHang findById(UUID id);

    CuaHang update(UUID id, CuaHang cuaHang);
}
