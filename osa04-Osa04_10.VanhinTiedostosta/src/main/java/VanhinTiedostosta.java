
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin = -1;
        String vanhus = "";
        
        System.out.println("Mikä tiedosto luetaan?");
        String j = lukija.nextLine();
        
        try(Scanner ju = new Scanner(new File(j))){
            
            while(ju.hasNextLine()){
                String rivi = ju.nextLine();
                
                if(rivi.trim().length() == 0){
                    continue;
                }
                String[] osat = rivi.split(",");
                String nimi = osat[0];
                int ika = Integer.valueOf(osat[1]);
                
                if(ika > vanhin){
                    //vanhus = nimi;
                    vanhin = ika;
                }
                        
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VanhinTiedostosta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Vanhin oli: " + vanhus);

    }
}
