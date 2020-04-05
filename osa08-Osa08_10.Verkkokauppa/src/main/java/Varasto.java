
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Varasto {
  
    private Map<String, Integer> tuotteet;
    private Map<String, Integer> saldot;
    
    public Varasto(){
        this.tuotteet = new HashMap<>();
        this.saldot = new HashMap<>();
        
        
        
    }
    


public void lisaaTuote(String tuote, int hinta, int saldo){
    tuotteet.put(tuote, hinta);
    saldot.put(tuote, saldo);
    
    

}

public int hinta(String tuote){
    if(tuotteet.containsKey(tuote)){
        return tuotteet.get(tuote);
    }
    return -99;

}

public int saldo(String tuote){
    if(saldot.containsKey(tuote)){
        return saldot.get(tuote);
    }
    
    return 0;
    
}

public boolean ota(String tuote){
    if(saldot.containsKey(tuote)){
        if(saldot.get(tuote) > 0){
            saldot.put(tuote, saldot.get(tuote) -1);
            return true;
        }
        
       
    }
    return false;
}

public Set<String> tuotteet(){
    return tuotteet.keySet();
    
    
}
    
}











