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
public class LoggingDaoImpl implements LoggingDao{

    @Override
    public void login() {
        System.out.println("Prijavljujem se");
    }

    @Override
    public void logout() {
        System.out.println("Odjavljujem se");
    }
    
}
