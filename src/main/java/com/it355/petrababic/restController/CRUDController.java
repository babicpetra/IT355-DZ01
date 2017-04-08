/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.restController;

import com.it355.petrababic.entity.Ponuda;
import com.it355.petrababic.entity.Potraznja;
import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.entity.User;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CRUDController {

    @Autowired
    PonudaDao ponudaDao;

    @RequestMapping(value = {"/", "/pocetna"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "pocetna";
    }

    @RequestMapping(value = "/upisPonude", method = RequestMethod.GET)
    public String addPonuda(Model model) {
        model.addAttribute("ponuda", new Ponuda());
        model.addAttribute("tipovi", ponudaDao.getTipovi());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addAttribute("username", name);
        return "upisPonude";
    }

    @RequestMapping(value = "/editPonuda/{id}", method = RequestMethod.GET)
    public String addPonuda(@PathVariable("id") int id, Model model) {
        Ponuda ponuda = ponudaDao.getPonudaById(id);
        model.addAttribute("ponuda", ponuda);
        model.addAttribute("tipovi", ponudaDao.getTipovi());
        return "upisPonude";
    }

    @RequestMapping(value = "/upisPonude", method = RequestMethod.POST)
    public ModelAndView addPonuda(@ModelAttribute("ponuda") Ponuda p, ModelAndView model) {
        //p.setEnabled(Boolean.TRUE);
        p = ponudaDao.addPonuda(p);
        model.addObject("tipovi", ponudaDao.getTipovi());
        model.addObject("successMsg", "Product successfully added");
        model.addObject("ponuda", p);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        model.addObject("username", name);
        model.setViewName("upisPonude");
        return model;
    }

    /*
     @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
     public String addCategory(Model model) {
     model.addAttribute("category", new Category());
     return "addCategory";
     }

     @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
     public ModelAndView addCategory(@ModelAttribute("category") Category p, ModelAndView model) {
     p.setEnabled(Boolean.TRUE);
     shoppingCartDao.addCategory(p);
     model.addObject("successMsg", "caetgory successfully added");
     return model;
     }
     */
    @RequestMapping(value = "/ponude", method = RequestMethod.GET)
    public ModelAndView getPonude(ModelAndView model) {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }
        
        model.addObject("ponude", ponudaDao.getAllPonude());
        model.addObject("ponuda", new Ponuda());
        return model;
    }
    
    @RequestMapping(value = "/korisnik/{id}", method = RequestMethod.GET)
    public ModelAndView korisnik(ModelAndView model,@PathVariable("id") int id, HttpServletRequest request) {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }
        Ponuda ponuda = ponudaDao.getPonudaById(id);
        model.addObject("ponuda", ponuda);
        model.setViewName("korisnik");
        return model;
    }

    @RequestMapping(value = "/korisnici", method = RequestMethod.GET)
    public ModelAndView getKorisnici(ModelAndView model) {
        model.addObject("korisnici", ponudaDao.getAllUsers());
        model.addObject("korisnik", new User());
        model.setViewName("korisnici");
        return model;
    }

    @RequestMapping(value = "/deletePonuda/{id}", method = RequestMethod.GET)
    public String deletePonuda(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting ponuda with id " + id);
        Ponuda ponuda = ponudaDao.getPonudaById(id);
        if (ponuda == null) {
            System.out.println("Unable to delete. Ponuda with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        ponudaDao.deletePonuda(ponuda);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = "/deleteKorisnik/{id}", method = RequestMethod.GET)
    public String deleteKorisnik(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting korisnik with id " + id);
        User user = ponudaDao.getUserById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        ponudaDao.deleteUser(user);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = "/upisPotraznje", method = RequestMethod.GET)
    public String addPotraznja(Model model) {
        model.addAttribute("potraznja", new Potraznja());
        model.addAttribute("tipovi", ponudaDao.getTipovi());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addAttribute("username", userDetail.getUsername());
        }
        return "upisPotraznje";
    }

    @RequestMapping(value = "/upisPotraznje", method = RequestMethod.POST)
    public ModelAndView addPotraznja(@ModelAttribute("potraznja") Potraznja p, ModelAndView model) {
        //p.setEnabled(Boolean.TRUE);
        p = ponudaDao.addPotraznja(p);
        model.addObject("tipovi", ponudaDao.getTipovi());
        model.addObject("successMsg", "Product successfully added");
        model.addObject("potraznja", p);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("upisPotraznje");
        return model;
    }

    @RequestMapping(value = "/potraznje", method = RequestMethod.GET)
    public ModelAndView getPotraznje(ModelAndView model) {
        model.addObject("potraznje", ponudaDao.getAllPotraznje());
        model.addObject("potraznja", new Potraznja());
        return model;
    }

    @RequestMapping(value = "/deletePotraznja/{id}", method = RequestMethod.GET)
    public String deletePotraznja(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting potraznja with id " + id);
        Potraznja potraznja = ponudaDao.getPotraznjaById(id);
        if (potraznja == null) {
            System.out.println("Unable to delete. Potraznja with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        ponudaDao.deletePotraznja(potraznja);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = {"/reg",}, method = RequestMethod.GET)
    public String reg(Model model, Authentication authentication) {

        model.addAttribute("regi", new User());

        return "register";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public ModelAndView reg(@ModelAttribute("regi") User p, ModelAndView model) {

        try {

            p = ponudaDao.addUser(p);
            model.addObject("successMsg", "Uspešno ste se registrovali! Prijavite se za nastavak");
            model.addObject("successMsgAdmin", "Uspešno ste upisali admina!");
        } catch (RuntimeException r) {
            r.printStackTrace();
            model.addObject("successMsg", "Username je zauzet!");
        }

        model.addObject("regi", p);

        model.setViewName("register");
        return model;
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

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {

        ModelAndView model = new ModelAndView();

        //check if user is login
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }

        model.setViewName("403");
        return model;

    }
    
    
   
}

