package com.haydikodlayalim.service.impl;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.service.KisiService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class KisiServiceImpl implements KisiService {

    @Override
    public KisiDto save(KisiDto kisiDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public KisiDto getAll(KisiDto kisiDto) {
        return null;
    }

    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
