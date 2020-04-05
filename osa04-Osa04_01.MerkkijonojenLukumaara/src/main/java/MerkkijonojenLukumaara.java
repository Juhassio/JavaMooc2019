
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> maara = new ArrayList<>();
        int maarat = 0;
        
        while(true){
            String merkkijono = lukija.nextLine();
            if(merkkijono.equals("loppu")){
                break;
            }
            maara.add(merkkijono);
            maarat++;
            
            
        }
        
        System.out.println(maarat);
        
        System.out.println(maara.size());
        
    }
}
