
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int luku = Integer.valueOf(lukija.nextLine());
        
        int luku2 = luku * 60 * 60 * 24;
        
        System.out.println(luku2);
                

        // toteuta ohjelma tänne

    }
}
