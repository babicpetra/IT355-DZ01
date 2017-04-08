/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.dao.impl;

import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.entity.Ponuda;
import com.it355.petrababic.entity.Potraznja;
import com.it355.petrababic.entity.TipLesnika;
import com.it355.petrababic.entity.User;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ko
 */
@Repository("ponudaDao")
@Service
public class PonudaDaoImpl implements PonudaDao {

    @SuppressWarnings("unused")
    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private SessionFactory sessionFactory;

    //kreiramo seter za sesiju
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //kreiramo geter za sesiju
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public Ponuda addPonuda(Ponuda ponuda) {
        return (Ponuda) getSession().merge(ponuda);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Ponuda> getAllPonude() {
        List<Ponuda> results = (List<Ponuda>) getSession().createCriteria(Ponuda.class).list();
        return results;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public Ponuda getPonudaById(int id) {
        Ponuda ponuda = (Ponuda) getSession().createCriteria(Ponuda.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return ponuda;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void deletePonuda(Ponuda ponuda) {
        getSession().delete(ponuda);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void editPonuda(Ponuda ponuda) {
        getSession().saveOrUpdate(ponuda);

    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public TipLesnika getTipById(int id) {
        TipLesnika tip = (TipLesnika) getSession().createCriteria(TipLesnika.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return tip;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public Potraznja addPotraznja(Potraznja potraznja) {
        return (Potraznja) getSession().merge(potraznja);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Potraznja> getAllPotraznje() {
        List<Potraznja> results = (List<Potraznja>) getSession().createCriteria(Potraznja.class).list();
        return results;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<TipLesnika> getTipovi() {
        List<TipLesnika> results = (List<TipLesnika>) getSession().createCriteria(TipLesnika.class).list();
        return results;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void deletePotraznja(Potraznja potraznja) {
        getSession().delete(potraznja);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void editPotraznja(Potraznja potraznja) {
        getSession().saveOrUpdate(potraznja);

    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public Potraznja getPotraznjaById(int id) {
        Potraznja potraznja = (Potraznja) getSession().createCriteria(Potraznja.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return potraznja;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public User addUser(User u) {
        Query query = getSession().
                createQuery("from User u where u.username = :key"); //provera da li username postoji
        query.setString("key", u.getUsername());

        if (query.uniqueResult() == null) {

            return (User) getSession().merge(u);

        } else {
            throw new RuntimeException();

        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void deleteUser(User user) {
        getSession().delete(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<User> getAllUsers() {
        List<User> results = (List<User>) getSession().createCriteria(User.class).list();
        return results;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public User getUserById(int id) {
        User tip = (User) getSession().createCriteria(User.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        return tip;
    }

}
