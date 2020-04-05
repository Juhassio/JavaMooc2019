/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author juhassio
 */
public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio(){
        this.tilavuus = 2000;
        this.saldo = 0;
        
    }
    
    public Maitosailio(double tilavuus){
        this.tilavuus = tilavuus;
        this.saldo = 0;
        
    }
    
    public double getTilavuus(){
        return this.tilavuus;
    }
    
    public double getSaldo(){
        return this.saldo;
        
    }
    
    public double paljonkoTilaaJaljella(){
        return tilavuus -saldo;
        
    }
    
    public void lisaaSailioon(double maara){
        if (saldo + maara <= tilavuus) {
            saldo += maara;
        } else {
            saldo = maara - (maara - tilavuus);
        }
        
        
        
    }
    
    public double otaSailiosta(double maara){
         double palautettava = 0.0;
        if (saldo - maara < 0) {
            saldo = 0.0;
            
        } else if (maara < saldo) {
            palautettava = maara;
            saldo = saldo - maara;
        }
        
        return palautettava;
    }
    
    public String toString(){
        
        return "" +Math.ceil(getSaldo()) + "/" + Math.ceil(this.tilavuus);
    }
        
    
}
