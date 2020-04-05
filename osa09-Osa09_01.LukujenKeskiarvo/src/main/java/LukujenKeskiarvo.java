
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        List<String> merkkijonot = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, " + " 'loppu' " +"lopettaa.");
        
        while(true){
            
            String jonot = lukija.nextLine();
            if(jonot.equals("loppu")){
                break;
            }
            
            merkkijonot.add(jonot);
            
        }
        
        double keskiarvo = merkkijonot.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
        

    }
}
