
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        try(Scanner l = new Scanner(new File(tiedosto))){
            while(l.hasNextLine()){
                lista.add(l.nextLine());
                
                
            }
            
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }
        
        if(lista.contains(etsittava)){
            System.out.println("Löytyi!");
        }else {
            System.out.println("Ei löytynyt.");
        }
        
        
        

    }
}
