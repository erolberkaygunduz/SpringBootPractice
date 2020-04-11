package com.haydikodlayalim.redisapp.api;

import com.haydikodlayalim.redisapp.service.RedisCasheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCasheController {

    private int sayac = 0;

    @Autowired
    private RedisCasheService redisCasheService;

    @GetMapping
    public String casheControl() throws  InterruptedException {
        if (sayac == 5){
            redisCasheService.clearCashe();
            sayac = 0;
        }
        sayac++;
        return redisCasheService.longRunningMethod();

    }
}
