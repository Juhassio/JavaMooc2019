
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> jonot = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa");
        
        while(true){
            String jono = lukija.nextLine();
            if(jono.equals("loppu")){
                break;
            }
            
            jonot.add(jono);
            
        }
        
        double positiivisetJonot = jonot.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku > 0)
                .average()
                .getAsDouble();
        
        double negatiivisetJonot = jonot.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukjen keskiarvo? (n/p)");
        
        
            String kumpi = lukija.nextLine();
            if(kumpi.equals("n")){
                System.out.println("Negatiivisten lukujen keskiarvo: " + negatiivisetJonot);
            } else if(kumpi.equals("p")){
                System.out.println("Positiivisten lukujen keskiarvo: " + positiivisetJonot);
            }
        
                
                
        
        
        

    }
}
