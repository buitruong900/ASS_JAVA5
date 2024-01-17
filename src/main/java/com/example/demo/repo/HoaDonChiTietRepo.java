package com.example.demo.repo;

import com.example.demo.entity.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.HoaDonChiTiet;

@Repository
public interface HoaDonChiTietRepo extends JpaRepository<HoaDonChiTiet, IdHoaDonChiTiet> {
}
