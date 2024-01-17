package com.example.demo.servivce;

import com.example.demo.entity.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface HoaDonChiTietService {
    List<HoaDonChiTiet> getAll();

    HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet);

    Boolean delete(UUID id);

    HoaDonChiTiet update(HoaDonChiTiet hoaDonChiTiet, UUID id);

    HoaDonChiTiet detail(UUID id);

}
