
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Ensimmäinen:");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int luku2 = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        //int i = 0;
        
        while(luku <= luku2){
           System.out.println(luku);
            
            summa +=luku;
            luku++;
        }
        System.out.println(summa);
    }
}
