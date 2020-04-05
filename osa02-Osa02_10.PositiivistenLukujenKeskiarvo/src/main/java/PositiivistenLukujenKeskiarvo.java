
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int maara = 0;
        
        while(true){
            int luku = Integer.valueOf(lukija.nextLine());
            
            if(luku > 0){
                maara++;
                summa += luku;
                
            }
            if(luku == 0){
                break;
            }
             
        }
        double keskiarvo = 1.0*summa/maara;
        if(maara != 0){
            System.out.println(keskiarvo);
        }else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }

    }
}
