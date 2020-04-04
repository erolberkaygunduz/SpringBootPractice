package com.haydikodlayalim.service;

import com.haydikodlayalim.dto.KisiDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);
    void delete(Long id);
    KisiDto getAll(KisiDto kisiDto);
    Page<KisiDto> getAll(Pageable pageable);

}
