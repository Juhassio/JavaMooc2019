
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
public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lauma;
    
    public Lauma(){
        this.lauma = new ArrayList<>();
        
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Siirrettava siirra : lauma){
            s.append(siirra.toString());
            s.append("\n");
        }
        return s.toString();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava){
        lauma.add(siirrettava);
    }
    
    
    
    
    
    

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirra : lauma){
            siirra.siirra(dx, dy);
        }
    }
    
    
}
