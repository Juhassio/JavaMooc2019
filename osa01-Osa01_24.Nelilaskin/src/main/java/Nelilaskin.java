
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä ensimmäinen luku!");
        int luku = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        int summa = luku + luku2;
        int erotus = luku -luku2;
        int kerto = luku * luku2;
        double jako =(1.0 * luku/luku2);
        
        System.out.println(luku +  " + " + luku2 + " = " + summa);
        System.out.println(luku + " - " + luku2 + " = "+ erotus);
        System.out.println(luku + " * " + luku2 + " = " + kerto);
        System.out.println(luku + " / " + luku2 + " = " + jako);

        // toteuta ohjelma tänne

    }
}
