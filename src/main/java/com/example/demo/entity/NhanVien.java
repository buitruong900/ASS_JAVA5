package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhan_vien")
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private String ten_dem;
    private String ho;
    private String gioi_tinh;
    private Date ngay_sinh;
    private String dia_chi;
    private String sdt;
    private String mat_khau;
    @ManyToOne
    @JoinColumn(name = "id_ch", referencedColumnName = "id")
    private CuaHang cuaHang;
    @ManyToOne
    @JoinColumn(name = "id_cv", referencedColumnName = "id")
    private ChucVu chucVu;
    private Integer trang_thai;
}
