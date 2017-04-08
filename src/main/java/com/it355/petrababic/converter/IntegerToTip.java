/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.converter;

import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.entity.TipLesnika;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author ko
 */
@Component 
final class IntegerToTip implements Converter<String , TipLesnika> {

    @Autowired
    PonudaDao ponudaDao;

    @Override
    public TipLesnika convert(String  s) {
        if(s.isEmpty()){
            return null;
        }
        Integer valeu = Integer.valueOf(s);
        System.out.println("Konvertujem u tip");
        TipLesnika tip = ponudaDao.getTipById(valeu);
        return tip;
    }
}
