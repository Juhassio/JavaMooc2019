
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        
        
        
        while(true){
            
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            
            if(nimi.isEmpty()){
                break;
            }
            
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.parseInt(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi,ika));
            
            
            
            
            
        }
        
        System.out.println("Yhteensä: " + kirjat.stream().count() + " kirjaa");
        System.out.println("Kirjat:");
        kirjat.stream()
                .sorted(Comparator.comparing(Kirja :: getIka).thenComparing(Kirja :: getNimi)).collect(Collectors.toList())
                
                .forEach(k -> System.out.println(k));
        
        /*kirjat.stream()
                .sorted(Comparator.comparing(Kirja :: getNimi)).collect(Collectors.toList())
                .forEach(k -> System.out.println(k));
                
        
            */
        
        
        

                //.sorted(Comparator.comparing(Maat :: getLukutaito)).collect(Collectors.toList())
                //.forEach(maa -> System.out.println(maa));
    }

}
