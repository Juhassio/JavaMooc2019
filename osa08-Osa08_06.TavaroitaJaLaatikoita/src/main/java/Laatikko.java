
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
public class Laatikko implements Talletettava{
    private double maxpaino;
    private ArrayList<Talletettava> tavarat;
    
    public Laatikko(double maxpaino){
        this.maxpaino = maxpaino;
        this.tavarat = new ArrayList<>();
        
    }
    
    
    
    /*public double yhteisPaino(){
        double summa = 0;
        for(Talletettava tavaraa : tavarat){
            summa = tavaraa.paino() + paino();
        }
        return summa;
    }*/
    
    
    public void lisaa(Talletettava laatikko){
        if(this.paino() + laatikko.paino() < this.maxpaino){
            tavarat.add(laatikko);
        }
        
        
        
    }
    
    public String toString(){
        return "Laatikko: " + tavarat.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }
    
    
    @Override
    public double paino() {
        double paino = 0;
        for (Talletettava t : tavarat){
            
            paino = paino + t.paino();
        }
        
        
        return paino;
    }
    
    
}
