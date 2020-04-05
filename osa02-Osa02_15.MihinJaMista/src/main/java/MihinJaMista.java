
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        int i = 1;
        
        while(luku2 <= luku){
            System.out.println(luku2);
            luku2++;
        }
    }
}
