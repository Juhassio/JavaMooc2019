
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class YhdenTavaranLaatikko extends Laatikko{
    private ArrayList<Tavara> t;
    
    public YhdenTavaranLaatikko(){
        this.t = new ArrayList<>();
        
    }

    @Override
    public void lisaa(Tavara tavara) {
        if(t.isEmpty()){
            t.add(tavara);
        }
     
        
        
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if(t.contains(tavara)){
            return true;
        }
        return false;
    }
    
}
