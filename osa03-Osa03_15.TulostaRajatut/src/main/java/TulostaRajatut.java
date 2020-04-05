
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        luvut.add(5);
        luvut.add(1);
        
        tulostaRajatutLuvut(luvut, 0,5);
        
    }
    
    
    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut,int alaraja, int ylaraja){
         
        for(int luku : luvut){
            if(luku <= ylaraja && luku >= alaraja){
                System.out.println(luku);
                }
            }
            
        
    }

}
