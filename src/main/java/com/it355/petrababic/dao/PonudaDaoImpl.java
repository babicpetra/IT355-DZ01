/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.dao;

/**
 *
 * @author ko
 */
public class PonudaDaoImpl implements PonudaDao{

    @Override
    public void addPonuda() {
        System.out.println("Dodajem ponudu");
    }

    @Override
    public String addPonudaRet() {
                System.out.println("Dodajem ponudu i vraćam vrednost");
                return "dodato";
    }

    @Override
    public void addPonudaThrowException() throws Exception {
        System.out.println("Dodajem ponudu ali bacam gresku");
        throw new Exception("Generic Error");
    }

    @Override
    public void addPonudaAround(String name) {
        System.out.println("Dodajem ponudu sa sifrom: " + name);
    }
    
}
