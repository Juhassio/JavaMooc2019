
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        

        ArrayList<String> nimet = new ArrayList<>();
        int ika = 0;
        int maara = 0;
        
        
        while (true) {
            
        String luettu = lukija.nextLine();
        if (luettu.equals("")) {
            break;
        }
        
        String[] palat = luettu.split(",");
        ika = ika + Integer.valueOf(palat[1]);
        maara++;
        
        
        nimet.add(palat[0]);
                
               
            
    }
        

        int suurin = nimet.get(0).length();
        int index = 0;
        
        for(int i = 0; i <nimet.size(); i++){
            if(nimet.get(i).length() > suurin){
                suurin = nimet.get(i).length();
                
                
            }
        }
        
        
        
        double keskiarvo = (double) (1.0* ika/maara);
        String pisin = nimet.get(0);
        for(String k : nimet){
            if(k.length() > pisin.length()){
               pisin = k;
            }
        }
            
        
        
        System.out.println("Pisin nimi: " + pisin);
        System.out.println("Syntymävuosien keskiarvo: " + keskiarvo);
    }
    
}
