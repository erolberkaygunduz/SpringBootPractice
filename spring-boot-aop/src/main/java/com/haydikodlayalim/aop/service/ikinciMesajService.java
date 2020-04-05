package com.haydikodlayalim.aop.service;


import org.springframework.stereotype.Service;

@Service
public class ikinciMesajService {

    public void mesaj(String param){
        System.out.println(param);
    }
}
