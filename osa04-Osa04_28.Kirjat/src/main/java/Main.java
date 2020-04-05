
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        ArrayList<Kirjat> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if(nimi.isEmpty()){
                break;
            }
            
            System.out.print("Sivuja: ");
            int sivut = Integer.parseInt(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.parseInt(lukija.nextLine());
            
            kirjat.add(new Kirjat(nimi, sivut, vuosi));
            
        }
        
        System.out.println("");
        
        System.out.println("Mitä tulostetaan? ");
        String mitas = lukija.nextLine();
        
        int i = 0;
        
        while(i < kirjat.size()){
            Kirjat kirja = kirjat.get(i);
            
            if(mitas.contains("kaikki")){
                System.out.println(kirja);
               
                
            } else if(mitas.contains("nimi")){
                System.out.println(kirja.getNimi());
            }
            
            i++;
        }
        
        

    }
}
