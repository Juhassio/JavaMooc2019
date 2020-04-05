
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        int luku1 = Integer.valueOf(lukija.nextLine());
        
        int summa = luku + luku1;
        
        double neli = Math.sqrt(summa);
        
        System.out.println(neli);
        

    }
}
