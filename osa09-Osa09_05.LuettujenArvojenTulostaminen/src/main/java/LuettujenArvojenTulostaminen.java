
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        while(true){
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            lista.add(nimi);
        }
        
        lista.stream()
                .forEach(nimi -> System.out.println(nimi));

    }
}
