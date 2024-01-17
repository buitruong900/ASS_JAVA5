package com.example.demo.servivce;

import com.example.demo.entity.DongSP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface DongSPService {
    Page<DongSP> getPage(Pageable pageable);

    DongSP add(DongSP dongSP);

    Boolean delete(UUID id);

    DongSP update(UUID id, DongSP dongSP);

    DongSP detail(UUID id);
}
