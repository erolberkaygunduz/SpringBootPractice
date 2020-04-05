package com.haydikodlayalim.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String mesajVer(String param){
        System.out.println("Metodun mesajı param : "+param);
        return param;
    }

    public String mesaj(String message) {
        System.out.println("Metodun mesaji p: " + message);
        return message;
    }
}
