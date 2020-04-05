
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Muutoshistoria {
    private ArrayList<Double> historia;
    
    public Muutoshistoria(){
        this.historia = new ArrayList<>();
        
    }
    
    public void lisaa(double tilanne){
        historia.add(tilanne);
        
    }
    
    public void nollaa(){
        historia.clear();
    }
    
    public String toString(){
        return historia.toString();
        
       
        
    }
    
    public double maxArvo(){
        return Collections.max(historia);
    }
    
    public double minArvo(){
        return Collections.min(historia);
    }
    
    public double keskiarvo(){
        double summa = 0;
        double montako = historia.size();
        for(double arvo : historia){
            summa += arvo;
            
        }
        double yht = summa / montako;
        return yht;
    }
    
}
