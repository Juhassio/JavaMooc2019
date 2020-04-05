/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author juhassio
 */
public class Lehma implements Lypsava,Eleleva{
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    
    
    
    private String nimi;
    private double utareTilavuus;
    private double utareMaitoMaara;
    
    
    public Lehma(){
        
        int luku = 0 + new Random().nextInt(NIMIA.length);
        nimi = NIMIA[luku];
        this.utareTilavuus = new Random().nextInt(26) +15;
        
    }
    
    public Lehma(String nimi){
        this.nimi = nimi;
        this.utareTilavuus = new Random().nextInt(26) +15;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    public double getTilavuus(){
        return this.utareTilavuus;
        
    }
    
    public double getMaara(){
        return utareMaitoMaara;
        
    }

    @Override
    public double lypsa() {
        double returnable = utareMaitoMaara;
        utareMaitoMaara = 0;
        return returnable;
    }

    @Override
    public void eleleTunti() {
        Random r = new Random();
        double randVal = 0.7 + (2.0 - 0.7) * r.nextDouble();
        
        if (utareMaitoMaara + randVal > utareTilavuus) {
            utareMaitoMaara = utareTilavuus;
        } else {
            utareMaitoMaara += randVal;
        }
    }
    
     public String toString() {
        return nimi + " " + Math.ceil(utareMaitoMaara * 100 / 100) + "/" + utareTilavuus;
    }
    
}
