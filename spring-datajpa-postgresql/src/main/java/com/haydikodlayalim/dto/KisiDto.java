package com.haydikodlayalim.dto;
import java.util.List;
import lombok.Data;

@Data
public class KisiDto {

    private Long Id;

    private String ad;

    private String soyad;

    private List<String> adresler;

}
