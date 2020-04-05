/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Kirja implements Talletettava{
    private String kirjailija;
    private String nimi;
    private double paino;
    
    
    public Kirja(String kirjailija, String nimi, double paino){
        
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.paino = paino;
        
    }
    

    @Override
    public double paino() {
        return this.paino;
    }
    
    public String toString(){
        return this.kirjailija + ": " + this.nimi;
    }
    
}
