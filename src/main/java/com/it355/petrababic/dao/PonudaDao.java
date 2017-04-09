/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.dao;

import java.util.List;
import com.it355.petrababic.entity.Ponuda;
import com.it355.petrababic.entity.Potraznja;
import com.it355.petrababic.entity.TipLesnika;
import com.it355.petrababic.entity.User;

/**
 *
 * @author ko
 */
public interface PonudaDao {
    public Ponuda addPonuda(Ponuda ponuda);
    public List<Ponuda> getAllPonude();
    public Ponuda getPonudaById(int id);
    public void deletePonuda(Ponuda ponuda);
    public void editPonuda(Ponuda ponuda);
    public TipLesnika getTipById(int id);
    public List<TipLesnika> getTipovi();
    public Potraznja addPotraznja(Potraznja potraznja);
    public List<Potraznja> getAllPotraznje();
    public Potraznja getPotraznjaById(int id);
    public void deletePotraznja(Potraznja potraznja);
    public void editPotraznja(Potraznja potraznja);
    public User addUser(User u);
    public void deleteUser(User user);
    public List<User> getAllUsers();
    public User getUserById(int id);
   

}
