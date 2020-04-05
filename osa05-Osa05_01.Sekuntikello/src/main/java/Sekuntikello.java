/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Sekuntikello {
    private Viisari sekuntti;
    private Viisari sadas;
    
    
    public Sekuntikello(){
        this.sadas = new Viisari(100);
        this.sekuntti = new Viisari(60);
        
    }
    
    public void etene(){
        this.sadas.etene();
        
        if(this.sadas.arvo() == 0){
            this.sekuntti.etene();
        }
        
    }
    
    public String toString(){
        return sekuntti + ":" + sadas;
        
    }
    
}
