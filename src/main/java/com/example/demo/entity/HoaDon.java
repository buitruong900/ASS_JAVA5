package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "hoa_don")
@Data
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id_kh")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "id_nv")
    private NhanVien nhanVien;
    private String ma;
    private Date ngay_tao;
    private Date ngay_thanh_toan;
    private Date ngay_ship;
    private Date ngay_nhan;
    private Integer tinh_trang;
    private String ten_nguoi_nhan;
    private String dia_chi;
    private String sdt;
}
