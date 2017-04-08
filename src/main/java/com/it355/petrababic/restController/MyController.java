/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.petrababic.restController;


import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.entity.Ponuda;
import com.it355.petrababic.entity.Potraznja;
import com.it355.petrababic.entity.TipLesnika;
import java.awt.PageAttributes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class MyController {
    
    @Autowired
    PonudaDao ponudaDao;
    
    
    
    //metoda koja prikazuje sve produkte, tipa get, a proizvode prikazuje u JSON formatu
    @RequestMapping(value = "/ponude", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ponuda>> getPonude() {
        System.out.println("Fetching ponude");
        List<Ponuda> products = ponudaDao.getAllPonude();
        if (products.size() == 0) {
            System.out.println("Ponude list empty");
            return new ResponseEntity<List<Ponuda>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Ponuda>>(products, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/potraznje", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Potraznja>> getPotraznje() {
        System.out.println("Fetching potraznje");
        List<Potraznja> products = ponudaDao.getAllPotraznje();
        if (products.size() == 0) {
            System.out.println("Ponude list empty");
            return new ResponseEntity<List<Potraznja>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Potraznja>>(products, HttpStatus.OK);
    }
    
    //metoda koja po id-ju prikazuje jedan produkt. 
    //na adresi http://localhost:8080/HibernateCRUD/product/4 pozivamo ovu metodu
    //
    @RequestMapping(value = "/ponuda/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Ponuda> getPonuda(@PathVariable("id") int id) {
        System.out.println("Fetching ponuda with id " + id);
        Ponuda ponuda = ponudaDao.getPonudaById(id);
        if (ponuda == null) {
            System.out.println("Ponuda with " + id + " not found");
            return new ResponseEntity<Ponuda>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Ponuda>(ponuda, HttpStatus.OK);
    }
    
    
    //metoda koja cuva proizvod u bazu
    @RequestMapping(value = "/upisPonude/", method = RequestMethod.POST)
    public ResponseEntity<Void> addPonuda(@RequestBody Ponuda ponuda) {
        System.out.println("Adding product " + ponuda.toString());
        ponudaDao.addPonuda(ponuda);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/upisPotraznje/", method = RequestMethod.POST)
    public ResponseEntity<Void> addPotraznja(@RequestBody Potraznja potraznja) {
        System.out.println("Adding potraznja " + potraznja.toString());
        ponudaDao.addPotraznja(potraznja);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    //metoda koja uzima proizvod iz baze po id-u, menja ga i cuva ga u bazi
   @RequestMapping(value = "/ponuda/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Ponuda> updatePonuda(@PathVariable("id") int id, @RequestBody Ponuda ponuda) {
        System.out.println("Updating ponuda " + id);
        ponuda.setId(id);
        ponudaDao.editPonuda(ponuda);
        return new ResponseEntity<Ponuda>(ponuda, HttpStatus.OK);
    }
      
    //metoda koja po id-u nalazi i brise produkt iz baze
    @RequestMapping(value = "/ponuda/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Ponuda> deletePonuda(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting ponuda with id " + id);
 
        Ponuda ponuda = ponudaDao.getPonudaById(id);
        if (ponuda == null) {
            System.out.println("Unable to delete. Ponuda with id " + id + " not found");
            return new ResponseEntity<Ponuda>(HttpStatus.NOT_FOUND);
        }
 
        ponudaDao.deletePonuda(ponuda);
        return new ResponseEntity<Ponuda>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tipovi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipLesnika>> getTip() {
        System.out.println("Fetching tip");
        List<TipLesnika> tipovi = ponudaDao.getTipovi();
        if (tipovi.size() == 0) {
            System.out.println("Tip list empty");
            return new ResponseEntity<List<TipLesnika>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<TipLesnika>>(tipovi, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/tip/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TipLesnika> getTip(@PathVariable("ID_TIPA") int id) {
        System.out.println("Fetching TIP with id " + id);
        TipLesnika c = ponudaDao.getTipById(id);
        if (c == null) {
            System.out.println("Tip with " + id + " not found");
            return new ResponseEntity<TipLesnika>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TipLesnika>(c, HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/potraznja/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Potraznja> updatePotraznja(@PathVariable("id") int id, @RequestBody Potraznja potraznja) {
        System.out.println("Updating potraznja " + id);
        potraznja.setId(id);
        ponudaDao.editPotraznja(potraznja);
        return new ResponseEntity<Potraznja>(potraznja, HttpStatus.OK);
    }
      
    //metoda koja po id-u nalazi i brise produkt iz baze
    @RequestMapping(value = "/potraznja/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Potraznja> deletePotraznja(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting potraznja with id " + id);
 
        Potraznja potraznja = ponudaDao.getPotraznjaById(id);
        if (potraznja == null) {
            System.out.println("Unable to delete. Potraznja with id " + id + " not found");
            return new ResponseEntity<Potraznja>(HttpStatus.NOT_FOUND);
        }
 
        ponudaDao.deletePotraznja(potraznja);
        return new ResponseEntity<Potraznja>(HttpStatus.OK);
    }
    
   /* 
    @RequestMapping(value = "/category/", method = RequestMethod.POST)
    public ResponseEntity<Void> addCategory(@RequestBody Category c) {
        System.out.println("Adding category " + c.toString());
        shoppingCartDao.addCategory(c);
 
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
      
    @RequestMapping(value = "/category/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Category> updateCategory(@PathVariable("id") int id, @RequestBody Category c) {
        System.out.println("Updating category " + id);
             
        c.setId(id);
        shoppingCartDao.editCategory(c);
        return new ResponseEntity<Category>(c, HttpStatus.OK);
    }
      
    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Category> deleteCategory(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting category with id " + id);
 
        Category c = shoppingCartDao.getCategoryById(id);
        if (c == null) {
            System.out.println("Unable to delete. Category with id " + id + " not found");
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
 
        shoppingCartDao.deleteCategory(c);
        return new ResponseEntity<Category>(HttpStatus.OK);
    }
 */
    
}
