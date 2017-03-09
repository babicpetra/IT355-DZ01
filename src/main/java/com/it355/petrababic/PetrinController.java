/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic;

/**
 *
 * @author ko
 */
import com.it355.petrababic.dao.LoggingDao;
import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.model.Ponuda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetrinController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private PonudaDao ponudaDao;

    @Autowired
    private LoggingDao loggingDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "Petrin prvi domaći");
        loggingDao.login();
        return "pocetna";
    }

    @RequestMapping(value = "/upisPonude", method = RequestMethod.POST)
    public String upisPonude(@ModelAttribute Ponuda ponuda, ModelMap model) {
        model.addAttribute("ime", ponuda.getImeIPrezime());
        model.addAttribute("kolicina", ponuda.getKolicina());
        model.addAttribute("email", ponuda.getEmail());
        model.addAttribute("cena", ponuda.getCena());
        model.addAttribute("lokacija", ponuda.getLokacija());
        model.addAttribute("brojTelefona", ponuda.getBrojTelefona());
        ponudaDao.addPonuda();
        loggingDao.logout();
        return "ponude";
    }

    @RequestMapping(value = "/ponude", method = RequestMethod.GET)
    public ModelAndView ponude() {
        System.out.println("Pozivam message source");
        ponudaDao.addPonuda();

        //  System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        return new ModelAndView("upis-ponude", "ponuda", new Ponuda());
    }

}
