
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        int i = 100;
        while(luku <= i){
            System.out.println(luku);
            luku++;
            
        }

    }
}
