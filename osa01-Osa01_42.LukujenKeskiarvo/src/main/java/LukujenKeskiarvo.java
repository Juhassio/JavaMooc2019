
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukuja = 0;
        int lakuja = 0;
        while (true) {
            System.out.println("Syötä luku ");
            int luku = Integer.valueOf(lukija.nextLine());
 
            if (luku == 0) {
                break;
            }
 
            lukuja = lukuja + luku;
            lakuja++;
        }
        System.out.println("Lukujen keskiarvo " + (double)lukuja/lakuja);
        //System.out.println("Lukuja yhteensä " + lakuja);
        //System.out.println("Lukujen summa " + lukuja);
    }


    
}
