package com.example.demo.repo;

import com.example.demo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ChiTietSanPham;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public interface ChiTietSanPhamRepo extends JpaRepository<ChiTietSanPham, UUID> {
}
