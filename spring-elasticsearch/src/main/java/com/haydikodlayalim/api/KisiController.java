package com.haydikodlayalim.api;

import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.repository.KisiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;


@RestController
@RequestMapping("//kisi")
public class KisiController {
    private final KisiRepository kisiRepository;

    @PostConstruct
    public void init(){
        Kisi kisi = new Kisi();
        kisi.setAd("Berkay");
        kisi.setSoyad("Gunduz");
        kisi.setAdres("Test");
        kisi.setDogumTarihi(Calendar.getInstance().getTime());
        kisi.setId("K65460");
        kisiRepository.save(kisi);
    }

    public KisiController(KisiRepository kisiRepository) {
        this.kisiRepository = kisiRepository;
    }
    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>>getKisi(@PathVariable String search){
        List<Kisi> kisiler = kisiRepository.getByCustomQuery(search);
        return ResponseEntity.ok(kisiler);
    }
}
