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
@Table(name = "ponuda")
public class Ponuda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PONUDE")
    private Integer id;

    @Column(name = "NASLOV_PONUDE")
    private String naslov;

    @Column(name = "LOK_PONUDE")
    private String lokacija;
    
    @Column(name = "EMAIL_PONUDE")
    private String email;

    @Column(name = "BR_TEL_PONUDE")
    private String brTel;
    
    @Column(name = "CENA_PONUDE")
    private double cena;
    
    @Column(name = "KOLICINA_PONUDE")
    private double kolicina;
    
    @Column(name = "USER")
    private String username;
    
    @Column(name = "opis")
    private String opis;
    
    @ManyToOne
    @JoinColumn(name = "TIP", referencedColumnName = "ID")
    private TipLesnika tip;

    public Ponuda() {
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    
    

    @Override
    public String toString() {
        return "Ponuda{" + "id=" + id + ", naslov=" + naslov + ", lokacija=" + lokacija + ", email=" + email + ", brTel=" + brTel + ", cena=" + cena + ", username=" + username + ", tip=" + tip + '}';
    }
    
    

    

    

    

   

   
}
