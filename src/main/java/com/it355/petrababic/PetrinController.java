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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/")
public class PetrinController {
@RequestMapping(method = RequestMethod.GET)
public String printHello(ModelMap model) {
model.addAttribute("poruka", "Petrin prvi domaći");
return "pozdrav";
}
}