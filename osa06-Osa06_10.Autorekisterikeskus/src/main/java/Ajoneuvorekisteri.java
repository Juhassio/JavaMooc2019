
import java.util.HashMap;
import java.util.HashSet;
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
public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri(){
        omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if(!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        if(omistajat.containsKey(rekkari)) {
            return false;
        }
        return false;
    }
    
    public String hae(Rekisterinumero rekkari) {
        //if(omistajat.containsKey(rekkari)){
            return this.omistajat.get(rekkari);
       // }
       // return null;
    }
     public boolean poista(Rekisterinumero rekkari){
        if(this.omistajat.containsKey(rekkari)){
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
     
    public void tulostaRekisterinumerot(){
        this.omistajat.entrySet().stream()
                .map(rek -> rek.getKey())
                .forEach(System.out:: println);
    }
    
    
     
     public void tulostaOmistajat() {
        Set set = new HashSet();
        omistajat.values().forEach((arvo) -> {
            set.add(arvo);
        });
        
        set.forEach((nimi) -> {
            
            System.out.println(nimi);
        });
    }

    
    
    
    
    
}
