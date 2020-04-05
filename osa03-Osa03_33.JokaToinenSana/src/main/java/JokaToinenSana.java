
import java.util.ArrayList;
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();
        
        
        while (true) {
            
        String luettu = lukija.nextLine();
        if (luettu.equals("")) {
            break;
        }
        
        String[] palat = luettu.split(" ");
        int i = 1;
            while(i < palat.length){
                nimet.add(palat[i]);
                i+=2;
            }
    }
        

        for (String nimi: nimet) {
            System.out.println(nimi);
    }
    }

    }

