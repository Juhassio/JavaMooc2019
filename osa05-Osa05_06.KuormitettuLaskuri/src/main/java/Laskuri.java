/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Laskuri {
    private int alku;
    
    public Laskuri(int alkuarvo){
        this.alku = alkuarvo;
    }
    
    public Laskuri(){
        this.alku = 0;
    }
    
    public int arvo(){
        return this.alku;
        
    }
    
    public void lisaa(){
        this.alku = this.alku + 1;
    }
    
    public void vahenna(){
        
        this.alku = this.alku -1;
    }
    
    public void lisaa(int lisays){
        if(lisays > 0){
            this.alku = this.alku + lisays;
        } 
        
    }
    
    public void vahenna(int vahennys){
        if(vahennys > 0){
            this.alku = this.alku - vahennys;

        }
    }
    
    
    
}
