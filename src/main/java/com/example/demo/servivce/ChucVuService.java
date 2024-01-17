package com.example.demo.servivce;

import com.example.demo.entity.ChucVu;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {
    List<ChucVu> getAll();

    ChucVu add(ChucVu chucVu);

    Boolean delete(UUID id);

    ChucVu detail(UUID id);

    ChucVu update(UUID id, ChucVu chucVu);

}
