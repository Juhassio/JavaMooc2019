
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");
        System.out.println("Listan suurin luku: "+ Collections.max(lista));

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
