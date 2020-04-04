package com.haydikodlayalim.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = ("kisi"))
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"} )
@ToString

public class Kisi {

    @Id
    @SequenceGenerator(name = "seq_kisi",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(length = 100,name = "ad")
    private String adi;

    @Column(length = 100,name = "soyad")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;
}
