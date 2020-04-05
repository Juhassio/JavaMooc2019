/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Opiskelija extends Henkilo {
    private int opintopisteet;
    
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopisteet = 0;
    }
    
    public String toString(){
        return super.toString() + "\n  " + "opintopisteitä " + this.opintopisteet;
                
        }
    
    public void opiskele(){
        this.opintopisteet +=1;
        
    }
    
    public int opintopisteita(){
        return this.opintopisteet;
    }
    
    
}
