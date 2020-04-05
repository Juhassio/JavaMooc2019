
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    private List<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
        
        
    }
    
    public int yhteisPaino(){
        int paino = 0;
        for(Tavara tavara : tavarat){
            paino += tavara.getPaino();
        }
        return paino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if(yhteisPaino() + tavara.getPaino() <= maksimipaino){
            tavarat.add(tavara);
             
        }
       
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        
            if(tavarat.contains(tavara)){
                return true;
            }
        return false;
        }
        
    
       
    
    
}
