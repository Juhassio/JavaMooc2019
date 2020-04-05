
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
public class HukkaavaLaatikko extends Laatikko{
    private ArrayList<Tavara> hukkaava;
    
    public HukkaavaLaatikko(){
        this.hukkaava = new ArrayList<>();
       
        
    }

    @Override
    public void lisaa(Tavara tavara) {
        hukkaava.add(tavara);
        
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
}
