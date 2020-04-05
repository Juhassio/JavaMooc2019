
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        
        try(Scanner tdl = new Scanner(new File("data.txt"))){
            
            while(tdl.hasNextLine()){
                String rivi = tdl.nextLine();
                System.out.println(rivi);
            }
            
            
        } catch (Exception e) {
            System.out.println("Virhe");
        }

    }
}
