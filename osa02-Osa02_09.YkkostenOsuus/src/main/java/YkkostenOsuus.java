
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int summa2 = 0;
        
        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if(luku == 0){
                break;
            }
            if(luku == 1) {
                summa++;
            }
            summa2++;
        }
        if(summa !=0){
            
        
        double tulos = (1.0* summa/summa2);
        

        System.out.println(tulos);
        } else {
            System.out.println("ykkösten osuutta ei voida laskea");
        }
        

    }
}
