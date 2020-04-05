
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Lyhenteet {
    private HashMap<String, String> testi;
    
    public Lyhenteet(){
        this.testi = new HashMap<>();
        
        
    }
    
    public void lisaaLyhenne(String lyhenne, String selite){
        testi.put(lyhenne, selite);
        
        
    }
    
    public boolean onkoLyhennetta(String lyhenne){
        if(testi.containsKey(lyhenne)){
            return true;
        }else {
            return false;
        }
    }
    
    public String haeLyhenne(String lyhenne){
        if(testi.containsKey(lyhenne)){
            return testi.get(lyhenne);
            
        }
        return null;
    }
    
}
