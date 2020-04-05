
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<Kirja> lueKirjat(String tiedosto){
        List<Kirja> kirjat = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(rivi -> new Kirja(rivi[0],Integer.valueOf(rivi[1]),Integer.valueOf(rivi[2]),(rivi[3])))
                    .collect(Collectors.toCollection(ArrayList::new))
                    .forEach(k -> kirjat.add(k));
                            
                            
                            
                    
        } catch (IOException ex) {
            System.out.println("Virhe");        }
        return kirjat;
        
    }

}
