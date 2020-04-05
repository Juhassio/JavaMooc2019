
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String l = lukija.nextLine();
        
        
        try(Scanner t = new Scanner(new File(l))){
            while(t.hasNextLine()){
                String line = t.nextLine();
                System.out.println(line);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KysytynTiedostonTulostaminen.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
