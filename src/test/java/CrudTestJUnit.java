/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.it355.petrababic.dao.PonudaDao;
import com.it355.petrababic.entity.TipLesnika;
import com.it355.petrababic.entity.Ponuda;
import com.it355.petrababic.entity.Potraznja;
import com.it355.petrababic.entity.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ko
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/PetraBabic-servlet.xml"})
public class CrudTestJUnit {

    @Autowired
    private PonudaDao ponudaDao;


    public CrudTestJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   

    @Test
    public void createPonudaTest() {
        Ponuda ponuda = new Ponuda();
        ponuda.setNaslov("naslov");
        ponuda.setCena(100);
        ponuda.setBrTel("078875765");
        ponuda.setKolicina(650);
        ponuda.setLokacija("Kosovska");
        ponuda.setUsername("Petra");
        ponuda.setTip(new TipLesnika(1,"rimski"));
        ponuda.setEmail("petra@gmail.com");
        Ponuda newPonuda = ponudaDao.addPonuda(ponuda);
        ponudaDao.deletePonuda(newPonuda);
        Assert.assertNotNull(newPonuda);
    }
    
    
    @Test
    public void createPotraznjaTest() {
        Potraznja potraznja = new Potraznja();
        potraznja.setNaslov("naslov");
        potraznja.setCena(100);
        potraznja.setBrTel("078875765");
        potraznja.setKolicina(100);
        potraznja.setLokacija("Kosovska");
        potraznja.setUsername("Petra");
        
        potraznja.setEmail("petra@gmail.com");
        Potraznja newPotraznja = ponudaDao.addPotraznja(potraznja);
        ponudaDao.deletePotraznja(newPotraznja);
        Assert.assertNotNull(newPotraznja);
    }

    @Test
    public void getPonudaByIdTest() {
        Ponuda ponuda = new Ponuda();
        ponuda.setNaslov("naslov");
        ponuda.setCena(100);
        ponuda.setBrTel("078875765");
        ponuda.setKolicina(650);
        ponuda.setLokacija("Kosovska");
        ponuda.setUsername("Petra");
        ponuda.setTip(new TipLesnika(1,"rimski"));
        ponuda.setEmail("petra@gmail.com");
        Ponuda newPonuda = ponudaDao.addPonuda(ponuda);
        Ponuda get
                = ponudaDao.getPonudaById(newPonuda.getId());
        ponudaDao.deletePonuda(newPonuda);
        Assert.assertNotNull(get);
    }
    
    @Test
    public void getPotraznjaByIdTest() {
        Potraznja potraznja = new Potraznja();
        potraznja.setNaslov("naslov");
        potraznja.setCena(100);
        potraznja.setBrTel("078875765");
        potraznja.setKolicina(100);
        potraznja.setLokacija("Kosovska");
        potraznja.setUsername("Petra");
        potraznja.setTip(new TipLesnika(1,"rimski"));
        potraznja.setEmail("petra@gmail.com");
        Potraznja newPotraznja = ponudaDao.addPotraznja(potraznja);
        Potraznja get
                = ponudaDao.getPotraznjaById(newPotraznja.getId());
        ponudaDao.deletePotraznja(newPotraznja);
        Assert.assertNotNull(get);
    }

   @Test
    public void deletePonudaTest() {
        Ponuda ponuda = new Ponuda();
        ponuda.setNaslov("naslov");
        ponuda.setCena(100);
        ponuda.setBrTel("078875765");
        ponuda.setKolicina(650);
        ponuda.setLokacija("Kosovska");
        ponuda.setUsername("Petra");
        ponuda.setTip(new TipLesnika(1,"rimski"));
        ponuda.setEmail("petra@gmail.com");
        Ponuda newPonuda = ponudaDao.addPonuda(ponuda);
        ponudaDao.deletePonuda(newPonuda);
        Ponuda deletedPonuda = ponudaDao.getPonudaById(newPonuda.getId());
        Assert.assertNull(deletedPonuda);
    }
    
    @Test
    public void deletePotraznjaTest() {
        Potraznja potraznja = new Potraznja();
        potraznja.setNaslov("naslov");
        potraznja.setCena(100);
        potraznja.setBrTel("078875765");
        potraznja.setKolicina(100);
        potraznja.setLokacija("Kosovska");
        potraznja.setUsername("Petra");
        potraznja.setTip(new TipLesnika(1,"rimski"));
        potraznja.setEmail("petra@gmail.com");
        Potraznja newPotraznja = ponudaDao.addPotraznja(potraznja);
        ponudaDao.deletePotraznja(newPotraznja);
        Potraznja
                deletedPotraznja
                = ponudaDao.getPotraznjaById(newPotraznja.getId());
        Assert.assertNull(deletedPotraznja);
    }
    
    

}
