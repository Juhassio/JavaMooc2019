
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Kirjasto {
    private ArrayList<Kirja> kirjasto;
    
    
    
    public Kirjasto(){
        this.kirjasto = new ArrayList<Kirja>();
        
        
    
        
    }
    public void lisaaKirja(Kirja uusiKirja){
        kirjasto.add(uusiKirja);
        
        
        
    }
    
    public void tulostaKirjat(){
        for(int i = 0; i < kirjasto.size(); i++){
            System.out.println(kirjasto.get(i));
            
            
        }
        
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja haluttu : this.kirjasto){
            if(StringUtils.sisaltaa(haluttu.nimeke(),nimeke)){
                loydetyt.add(haluttu);
            }
        }
        
        return loydetyt;
        
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja haluttu : this.kirjasto){
            if(StringUtils.sisaltaa(haluttu.julkaisija(), julkaisija)){
                loydetyt.add(haluttu);
            }
        }
        
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        
        for (Kirja haluttu : this.kirjasto){
            if(haluttu.julkaisuvuosi() == julkaisuvuosi){
                loydetyt.add(haluttu);
            }
        }
        
        return loydetyt;
    }
    
    
    
    

    
}



