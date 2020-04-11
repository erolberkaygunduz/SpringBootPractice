package com.haydikodlayalim.redisapp.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCasheService {

    @Cacheable(cacheNames = "BerkayGunduzCashe")
    public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000L);
        return "metod calisti.";
    }

    @CacheEvict(cacheNames = "BerkayGunduzCashe")
    public void clearCashe(){
        System.out.println("cashe temizlendi");
    }

}
