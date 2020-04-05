package com.haydikodlayalim.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.haydikodlayalim.aop.service.*.*(..))")
    public void   mesajVerMetodundanOnce(JoinPoint joinPoint){
        System.out.println("Mesaj ver modundan once parametre yakalandi :"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.haydikodlayalim.aop.service.*.*(..))")
    public void mesakVerMetodundanSonra(JoinPoint joinPoint){
        System.out.println("Mesaj ver modundan sonra parametre yakalandi :"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
}
