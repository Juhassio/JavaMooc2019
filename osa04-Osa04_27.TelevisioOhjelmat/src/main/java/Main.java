
import java.util.ArrayList;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        
        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while(true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            System.out.print("Pituus: ");
            int pituus = Integer.parseInt(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        
        System.out.println("");
        
        System.out.println("Ohjelman maksimipituus: ");
        int maksimiPituus = lukija.nextInt();
        
        int indeksi = 0;
        while(indeksi < ohjelmat.size()){
            if(ohjelmat.get(indeksi).getPituus() <= maksimiPituus){
                System.out.println(ohjelmat.get(indeksi));
            }
            indeksi++;
        
       
        
        }  
        
    }
}