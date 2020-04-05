
public class Paaohjelma {

    public static void main(String[] args) {
        
        Maksukortti pekka = new Maksukortti(20);
        Maksukortti matti = new Maksukortti(30);
        
        pekka.syoMaukkaasti();
        matti.syoEdullisesti();
        
        System.out.println("Pekka: " + pekka);
        System.out.println("Matti:" + matti);
        
        pekka.lataaRahaa(20);
        matti.syoMaukkaasti();
        
        System.out.println("Pekka: " + pekka);
        System.out.println("MAtti: " + matti);
        
        pekka.syoEdullisesti();
        pekka.syoEdullisesti();
        
        matti.lataaRahaa(50);
        
        System.out.println("Pekka: " + pekka);
        System.out.println("Matti: " + matti);
        
        
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!

    }
}
