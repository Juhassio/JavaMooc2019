
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
         // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int luku = Integer.valueOf(lukija.nextLine());
        //System.out.println("Mistä lähtien?");
        //int luku2 = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        int i = 0;
        
        while(i < luku){
           // System.out.println(i);
            i++;
            summa += i;
        }
        System.out.println("Summa on " + summa);

    }
}
