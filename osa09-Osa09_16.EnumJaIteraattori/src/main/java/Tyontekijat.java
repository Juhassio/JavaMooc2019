
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Tyontekijat {
    
    private List<Henkilo> henkilot;
    
    
    public Tyontekijat(){
        this.henkilot = new ArrayList<>();
        
    }
    
    public void lisaa(Henkilo lisattava){
        henkilot.add(lisattava);
        
    }
    public void lisaa(List<Henkilo> lisattavat){
       
        //for(int i = 0; i < lisattavat.size(); i++){
        //    henkilot.add(lisattavat.get(i));
        //}
        
        
        
        lisattavat.stream()
                .forEach(henkilo -> lisaa(henkilo));
    }
    
    public void tulosta(){
        //henkilot.stream()
        //        .forEach(k -> System.out.println(k));
        
        Iterator<Henkilo> ite = henkilot.iterator();
        while(ite.hasNext()){
            Henkilo henkilo = ite.next();
            System.out.println(henkilo);
        }
        
        
        
        
    }
    
    public void tulosta(Koulutus koulutus){
        Iterator<Henkilo> ite = henkilot.iterator();
        
        while(ite.hasNext()){
            Henkilo h = ite.next();
            
            if(h.getKoulutus()== koulutus){
                System.out.println(h);
            }
        }
        
    }
    
    public void irtisano(Koulutus koulutus){
        Iterator<Henkilo> ite = henkilot.iterator();
        
        while(ite.hasNext()){
            Henkilo h = ite.next();
            if(h.getKoulutus() == koulutus){
                ite.remove();
            }
        }
        
    }
    
    
    
}
