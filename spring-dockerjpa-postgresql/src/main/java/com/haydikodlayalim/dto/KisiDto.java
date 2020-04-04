package com.haydikodlayalim.dto;

import com.haydikodlayalim.entity.Adres;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import java.util.List;
@Data
public class KisiDto {
    private Long id;

    private String adres;

    private String soyad;

    private List<String> adresler;

}


