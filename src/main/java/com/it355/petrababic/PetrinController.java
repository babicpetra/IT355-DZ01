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
import com.it355.model.Ponuda;
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
    
@RequestMapping(value="/", method = RequestMethod.GET)
public String printHello(ModelMap model) {
model.addAttribute("poruka", "Petrin prvi domaći");
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
        return "ponude";
    }
    
    @RequestMapping(value = "/ponude", method = RequestMethod.GET)
public ModelAndView ponude() {
        System.out.println("Pozivam message source");
      //  System.out.println(messageSource.getMessage("name", null, Locale.ENGLISH));
        return new ModelAndView("upis-ponude", "ponuda", new Ponuda());
}

 @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Losi login podaci!");
        }
        if (logout != null) {
            model.addObject("msg", "Izlogovani ste.");
        }
        model.setViewName("login");
        return model;
    }
}