package com.haydikodlayalim.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "kisiler", type = "kisi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kisi {
    public String getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getAdres() {
        return adres;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    @Id
    private String id;

    @Field(name ="ad", type = FieldType.Text)
    private String ad;

    public void setId(String id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Field(name ="soyad", type = FieldType.Text)
    private String soyad;

    @Field(name ="adres", type = FieldType.Text)
    private String adres;

    @Field(name ="dogum_tarihi", type = FieldType.Date)
    private Date dogumTarihi;
}
