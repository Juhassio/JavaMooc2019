/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Ostos {
    private String tuote;
    private int maara;
    private int hinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta){
        this.tuote = tuote;
        this.maara = kpl;
        this.hinta = yksikkohinta;
        
        
        
    }
    
    public int hinta(){
        int summa = this.hinta * this.maara;
        return summa;
        
    }
    
    public void kasvataMaaraa(){
        this.maara += 1;
    }
    
    public String toString(){
        return this.tuote + ": " + this.maara;
        
    }
               
        
    
    
    
    
}
