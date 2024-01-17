package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "cua_hang")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private String dia_chi;
    private String thanh_pho;
    private String quoc_gia;
}
