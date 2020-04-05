
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            String l = lukija.nextLine();
            if(l.equals("loppu")){
                break;
            }
            int luku = Integer.valueOf(l);
            System.out.println(luku*luku*luku);
            
         
        }

    }
}
