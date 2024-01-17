package com.example.demo.servivce;

import com.example.demo.entity.NXS;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface NxsService {
    Page<NXS> getPage(Pageable pageable);

    NXS add(NXS nxs);

    Boolean delete(UUID id);

    NXS detail(UUID id);

    NXS update(UUID id, NXS nxs);
}
