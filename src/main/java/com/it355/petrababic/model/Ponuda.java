/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.model;

/**
 *
 * @author ko
 */
public class Ponuda {
    private String imeIPrezime;
    private String email;
    private double kolicina;
    private String lokacija;
    private double cena;
    private String brojTelefona;

    public Ponuda() {
    }

    
    public Ponuda(String imeIPrezime, String email, double kolicina, String lokacija, double cena, String brojTelefona) {
        this.imeIPrezime = imeIPrezime;
        this.email = email;
        this.kolicina = kolicina;
        this.lokacija = lokacija;
        this.cena = cena;
        this.brojTelefona = brojTelefona;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

  
    
    
}
