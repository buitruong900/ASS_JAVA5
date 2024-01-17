package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "hoa_don_chi_tiet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTiet {
    @EmbeddedId
    private IdHoaDonChiTiet id;

    private Integer so_luong;
    private Double don_gia;

    @Override
    public String toString() {
        return "HoaDonChiTiet{" +
                "id ctsp=" + id.getIdChiTietSanPham().getId() +
                "id hoa don" + id.getIdHoaDon().getId() +
                ", so_luong=" + so_luong +
                ", don_gia=" + don_gia +
                '}';
    }
}
