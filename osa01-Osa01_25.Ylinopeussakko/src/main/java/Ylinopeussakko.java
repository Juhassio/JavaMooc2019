
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kerro nopeus:");
        int np = Integer.valueOf(lukija.nextLine());
        if(np > 120){
            System.out.println("Ylinopeussakko!");
        } else {
            System.out.println("");
        }
        

        // Toteuta ohjelmasi tähän. 
    }
}
