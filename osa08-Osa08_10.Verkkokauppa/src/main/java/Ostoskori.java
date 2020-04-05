
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Ostoskori {
    //private List<Ostos> kori;
    private Map<String,Ostos> kori;
    
    public Ostoskori(){
        //this.kori = new ArrayList<>();
        this.kori = new HashMap<>();
        
        
    }
    
    public void lisaa(String tuote, int hinta){
        this.kori.putIfAbsent(tuote, new Ostos(tuote, 0, hinta));
        this.kori.get(tuote).kasvataMaaraa();
        
        
        
    }
    
    public int hinta(){
        int hinta = 0;
        for(Ostos ostos : this.kori.values()){
            hinta = hinta + ostos.hinta();
            
        }
        return hinta;
       
    }
    
    public void tulosta(){
        for(String nimi : kori.keySet()){
            System.out.println(kori.get(nimi).toString());
        }
        
    }
    
}
