package com.haydikodlayalim;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@RestController
@RequestMapping("/pet")
@Api(value = "Benim Pet Api dokumentosyonum")
public class PetController {
    private List<Pet> petList = new ArrayList<>();

    @PostConstruct
    public void init(){
        petList.add(new Pet(1,"test pet",new Date()));
    }

    @PostMapping
    @ApiOperation(value = "yeni pet ekleme metodu",notes = "bu apiyi dikkatli kullan.")
    public ResponseEntity<Pet>kaydet(@RequestBody @ApiParam(value = "hayvan") Pet pet ){
        petList.add(pet);
        return ResponseEntity.ok(pet);
    }
    @GetMapping
    @ApiOperation(value = "pet listesi metodu",notes = "bu metod hepsını getırır")
    public ResponseEntity<List<Pet>> tumunuListele(){
        return ResponseEntity.ok(petList);
    }
}
