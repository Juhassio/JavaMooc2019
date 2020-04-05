
import java.util.ArrayList;
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //ArrayList<String> nimet = new ArrayList<>();

        
        
        while (true) {
            
        String luettu = lukija.nextLine();
        if (luettu.equals("")) {
            break;
        }
        
        String[] osat = luettu.split(" ");
        for (String osa : osat){
            System.out.println(osa);
        }
        }
    }
}
        
            
       /* String[] palat = luettu.split(" ");
        int i = 0;
            while(i < palat.length){
                nimet.add(palat[i]);
                i++;
            }
    }
        

        for (String nimi: nimet) {
            System.out.println(nimi);
    }
*/

    

