
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        tulostaTahtia(5);
        tulostaTahtia(9);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int i = 0;
        while(i < maara){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        // tehtävän ensimmäinen osa
    }

    public static void tulostaNelio(int sivunpituus) {
        int i = 0;
        while(i < sivunpituus){
            tulostaTahtia(sivunpituus);
            i++;
        }
        // tehtävän toinen osa
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int i = 0;
        while(i < korkeus){
            tulostaTahtia(leveys);
            i++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int i = 0;
        while(i < koko){
            tulostaTahtia(i+1);
            i++;
        }
        // tehtävän neljäs osa
    }
}
