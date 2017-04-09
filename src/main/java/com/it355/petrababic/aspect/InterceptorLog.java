/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.aspect;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author ko
 */
public class InterceptorLog implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked: " + method.getName());
        System.out.println("*******");
    }
     @After("execution(*com.it355.dao.LoggingDaoImpl.login(..))")
     public void logAfter(JoinPoint joinPoint) {
         System.out.println("logAfter() metoda je pozvana!");
         System.out.println("presretanje : " + joinPoint.getSignature().getName());
        System.out.println("******");
 }
}
