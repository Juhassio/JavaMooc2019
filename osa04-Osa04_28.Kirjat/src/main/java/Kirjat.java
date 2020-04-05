/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Kirjat {
    private String nimi;
    private int sivut;
    private int vuosi;
    
    public Kirjat(String nimi, int sivut, int vuosi){
        this.nimi = nimi;
        this.sivut= sivut;
        this.vuosi =vuosi;
        
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getSivut(){
        return this.sivut;
    }
    public int getVuosi(){
        return this.vuosi;
    }
    public String toString(){
        
        return this.nimi + ", " + this.sivut + " sivua" + ", " + this.vuosi;
       
       
        
    } 
    
    
    
}
