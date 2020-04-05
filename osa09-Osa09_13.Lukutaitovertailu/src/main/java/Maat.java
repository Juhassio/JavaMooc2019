
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Maat{
    private String maa;
    private int vuosi;
    private String sukupuoli;
    private double lukutaito;
    
    public Maat(String maa, int vuosi,String sukupuoli, double lukutaito ){
        this.maa = maa;
        this.vuosi = vuosi;
        this.sukupuoli = sukupuoli;
        this.lukutaito = lukutaito;
        
    }
    
    public double getLukutaito(){
        
        return this.lukutaito;
    }
    
    public String toString(){
        return this.maa + " (" + this.vuosi + "), " + this.sukupuoli + ", " + this.lukutaito;

    }

   

    

    
    
}
