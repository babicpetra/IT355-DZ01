/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

/**
 *
 * @author ko
 */
public class Student {
    private String imeIprezime;
    private int indeks;
    private int godina;

    public Student() {
    }

    public Student(String imeIprezime, int indeks, int godina) {
        this.imeIprezime = imeIprezime;
        this.indeks = indeks;
        this.godina = godina;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
    
    
}
