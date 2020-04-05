
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Velkakirja {
    private HashMap<String, Double> velka;
    
    public Velkakirja(){
        this.velka = new HashMap<>();
        
    }
    
    public void asetaLaina(String kenelle, double maara){
        velka.put(kenelle, maara);
        
    }
    
    public double paljonkoVelkaa(String kuka){
        return this.velka.getOrDefault(kuka, 0.0);
    }
    
}
