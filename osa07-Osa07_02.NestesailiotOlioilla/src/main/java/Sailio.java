/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Sailio {
    private int ensimmainen;
    
    
    
    public Sailio(){
        this.ensimmainen = 0;
        
        
    }
    
    public int sisalto(){
        return this.ensimmainen;
    }
    
    public void lisaa(int maara){
        if(maara > 0 &&  ensimmainen < 100 ){
            this.ensimmainen = ensimmainen + maara;
        }
        if(ensimmainen > 100){
            this.ensimmainen = 100;
        }
        
        
        
        
            
            
        
    }
    
    public void poista(int maara){
        if (maara > 0 && ensimmainen > 0){
            this.ensimmainen = ensimmainen - maara;
        }
        if(ensimmainen < 0){
            this.ensimmainen = 0;
        }
        
        
            
    }
    
    public String toString(){
        return ensimmainen + "/100";
    }
    
    
}
