
import java.util.Scanner;

public class Yhteenlasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        int summa = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        // toteuta ohjelma tänne

    }
}
