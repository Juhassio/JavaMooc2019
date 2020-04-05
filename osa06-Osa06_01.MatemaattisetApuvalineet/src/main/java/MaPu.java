
import java.util.ArrayList;

public class MaPu {
    
    public static double keskiarvo(ArrayList<Integer> luvut){
        double summa = 0;
        
        for(int luku : luvut){
            summa += luku;
            
        } 
        double keskiarvo1 = summa / luvut.size();
        
        
        return keskiarvo1;
        
    }

    // toteuta apumetodit tänne
}
