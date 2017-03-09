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
public interface PonudaDao {
    public void addPonuda();
    public String addPonudaRet();
    public void addPonudaThrowException()throws Exception;
    public void addPonudaAround(String name);
}
