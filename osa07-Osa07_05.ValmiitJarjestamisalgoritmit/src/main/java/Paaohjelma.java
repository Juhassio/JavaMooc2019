
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        String[]taulu = {"j", "h", "a"};
        
        jarjesta(taulukko);
        System.out.println(Arrays.toString(taulukko));
        jarjesta(taulu);
        System.out.println(Arrays.toString(taulu));
    }
    
    public static void jarjesta(int[]taulukko){
        Arrays.sort(taulukko);
    }
    
    public static void jarjesta(String[]taulukko){
        Arrays.sort(taulukko);
        
        
    }
    
    public static void jarjestaLuvut(ArrayList<Integer> luvut){
        Collections.sort(luvut);
        
        
    }
    
    public static void jarjestaMerkkijonot(ArrayList<String> luvut){
        Collections.sort(luvut);
    }

}
