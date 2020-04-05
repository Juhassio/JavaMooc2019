
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int vanhinIka = -1;
        String vanhin = "";

        while (true) {
        System.out.print(" ");
        String rivi = lukija.nextLine();

        if (rivi.equals("loppu")) {
        break;
        }

        String[] palat = rivi.split(",");
        String nimi = palat[0];
        int ika = Integer.valueOf(palat[1]);

        if (vanhin.equals("") || vanhinIka > ika) {
        vanhin = nimi;
        vanhinIka = ika;
            }
}

    System.out.println("Nuorin oli: " + vanhin);
        

    }
}
