package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "gio_hang")
@Data
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "id_kh", referencedColumnName = "id")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "id_nv", referencedColumnName = "id")
    private NhanVien nhanVien;
    private String ma;
    private Date ngay_tao;
    private Date ngay_thanh_toan;
    private String ten_nguoi_nhan;
    private String dia_chi;
    private String sdt;
    private Integer tinh_trang;
}
