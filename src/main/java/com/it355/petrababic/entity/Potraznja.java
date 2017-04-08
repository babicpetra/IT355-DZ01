/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ko
 */
@Entity
@Table(name = "potraznja")
public class Potraznja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_POTRAZNJE")
    private Integer id;

    @Column(name = "NASLOV_POTRAZNJE")
    private String naslov;

    @Column(name = "LOK_POTRAZNJE")
    private String lokacija;
    
    @Column(name = "EMAIL_POTRAZNJE")
    private String email;

    @Column(name = "BR_TEL_POTRAZNJE")
    private String brTel;

    @Column(name = "CENA_POTRAZNJE")
    private double cena;
    
    @Column(name = "KOLICINA_POTRAZNJE")
    private double kolicina;
    
    @Column(name = "USER")
    private String username;
    
    
    @ManyToOne
    @JoinColumn(name = "TIP", referencedColumnName = "ID")
    private TipLesnika tip;

    public Potraznja() {
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrTel() {
        return brTel;
    }

    public void setBrTel(String brTel) {
        this.brTel = brTel;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public TipLesnika getTip() {
        return tip;
    }

    public void setTip(TipLesnika tip) {
        this.tip = tip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }
    

    
    

    


   

   
}
