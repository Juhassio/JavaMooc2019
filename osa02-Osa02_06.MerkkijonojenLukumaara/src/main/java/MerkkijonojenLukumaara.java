
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        
        while(true){
            String jo = lukija.nextLine();
            
            if(jo.equals("loppu")){
                break;
            }
            summa++;
        }
        System.out.println(summa);

    }
}
