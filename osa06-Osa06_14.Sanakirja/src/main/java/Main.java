
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sanakirja sanakirja = new Sanakirja();
sanakirja.lisaa("apina", "monkey");
sanakirja.lisaa("banaani", "banana");
sanakirja.lisaa("cembalo", "harpsichord");

ArrayList<String> kaannokset = sanakirja.kaannoksetListana();

for (String kaannos: kaannokset) {
    System.out.println(kaannos);
}

Scanner lukija = new Scanner(System.in);

Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, sanakirja);
kayttoliittyma.kaynnista();
        
        
        
    }
}
