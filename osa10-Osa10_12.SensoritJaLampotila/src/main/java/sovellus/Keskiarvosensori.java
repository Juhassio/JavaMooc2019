/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juhassio
 */
public class Keskiarvosensori implements Sensori{
    private List<Sensori> sensorit;
    private List<Integer> mittaukset;
    
    public Keskiarvosensori(){
        sensorit = new ArrayList<>();
        mittaukset = new ArrayList<>();
    }

    @Override
    public boolean onPaalla() {
        
        
        for(Sensori s : sensorit){
            if(!s.onPaalla()){
                return false;
                
            }
        }
        return true;
        
    }

    @Override
    public void paalle() {
        for (Sensori sensori : sensorit){
            if(!sensori.onPaalla()){
                sensori.paalle();
            }
        }
        
    }
    
    

    @Override
    public void poisPaalta() {
        //sensorit.stream().forEach(s-> poisPaalta());
        for(Sensori sensori : sensorit){
           sensori.poisPaalta();
       }
        
    }

    @Override
    public int mittaa() {
        if(this.onPaalla() && sensorit.size() > 0){
            int kA = 0;
            kA = sensorit.stream().map((sensori) -> sensori.mittaa()).reduce(kA, Integer::sum);
            kA = kA / sensorit.size();
            mittaukset.add(kA);
            return kA;
        } else {
            throw new IllegalStateException("Keskiarvosensorin tulee olla päällä ja sisältää sensoreita ennen mittaamista");
        }
        
        
    }
    
    public void lisaaSensori(Sensori lisattava){
        
          
            sensorit.add(lisattava);
        
        
    }
    
    public List<Integer> mittaukset(){
        return mittaukset;
    }
    
}
