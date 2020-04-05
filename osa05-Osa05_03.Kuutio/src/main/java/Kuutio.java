/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Kuutio {
    private int sarma;
    
    public Kuutio(int sarmanPituus){
        this.sarma = sarmanPituus;
    }
    
    public int tilavuus(){
        int t = this.sarma * this.sarma * this.sarma;
        return t;
    }
    
    public String toString(){
        return "Kuution särmän pituus on " + this.sarma + ", tilavuus on " + tilavuus();
    }
    
    
}
