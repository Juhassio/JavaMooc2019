
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä kolmas luku!");
        int luku3 = Integer.valueOf(lukija.nextLine());
        
        double summa = 1.0 * (luku1 + luku2 + luku3) / 3 ;
        
        System.out.println("Syötettyjen lukujen keskiarvo on " + summa);
        // toteuta ohjelma tänne

    }
}
