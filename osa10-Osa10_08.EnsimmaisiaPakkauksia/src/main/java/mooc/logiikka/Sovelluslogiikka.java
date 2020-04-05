/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;

/**
 *
 * @author juhassio
 */
public class Sovelluslogiikka {
    //private Tekstikayttoliittyma k;
    private Kayttoliittyma l;
    
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma){
        l = kayttoliittyma;
        
    }
    
    public void suorita(int montaKertaa){
        int i = 0;
        while(i < montaKertaa){
            System.out.println("Sovelluslogiikka toimii");
            l.paivita();
            i++;
            
        }
    }
    
}
