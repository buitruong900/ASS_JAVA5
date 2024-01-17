package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "khach_hang")
@Data
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private String ten_dem;
    private String ho;
    private Date ngay_sinh;
    private String sdt;
    private String dia_chi;
    private String thanh_pho;
    private String quoc_gia;
    private String mat_khau;
}
