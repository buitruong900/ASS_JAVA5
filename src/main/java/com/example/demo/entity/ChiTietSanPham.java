package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nam_bh")
    private Integer nam_bh;

    @Column(name = "mo_ta")
    private String mo_ta;

    @Column(name = "so_luong_ton")
    private Integer so_luong_ton;

    @Column(name = "gia_nhap")
    private BigDecimal gia_nhap;

    @Column(name = "gia_ban")
    private BigDecimal gia_ban;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac", referencedColumnName = "id")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "id_sp", referencedColumnName = "id")
    private SanPham sanPham;

}
