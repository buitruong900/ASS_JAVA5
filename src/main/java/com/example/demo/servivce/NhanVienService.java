package com.example.demo.servivce;

import com.example.demo.entity.NhanVien;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAll();

    NhanVien add(NhanVien nhanVien);

    Boolean delete(UUID id);

    NhanVien update(UUID id, NhanVien nhanVien);

    NhanVien detail(UUID id);
}
