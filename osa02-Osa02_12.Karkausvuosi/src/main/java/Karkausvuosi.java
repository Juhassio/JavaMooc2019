
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna vuosi: ");
        int vuosi = lukija.nextInt();
        
        if(vuosi % 4 != 0){
            System.out.println("Vuosi ei ole karkausvuosi.");
        } else if (vuosi % 400 == 0 && vuosi % 100 == 0){
            System.out.println("Vuosi on karkausvuosi.");
        } else if (vuosi % 4 == 0 && vuosi % 100 !=0){
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
      

    
    }
}
