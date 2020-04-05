
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet: ");
        int piste = lukija.nextInt();
        
        if(piste < 0){
            
            System.out.println("Mahdotonta!");
        } else if(piste <= 49){
            System.out.println("Hylätty");
        } else if(piste <= 59){
            System.out.println("1");
        } else if(piste <=69){
            System.out.println("2");
        } else if(piste <=79){
            System.out.println("3");
        } else if(piste <=89){
            System.out.println("4");
            
        } else if(piste <=100){
            System.out.println("5");
            
        } else if(piste > 100){
            System.out.println("Uskomatonta!");
        }

    }
}