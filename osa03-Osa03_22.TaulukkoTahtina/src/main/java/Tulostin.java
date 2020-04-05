
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        
        
         for (int i = 0; i < taulukko.length; i++) {             
             
             for (int k = 0; k < taulukko[i]; k++) {
                 System.out.print("*");
             }
             System.out.print("\n");
        }
        
        
        // Kirjoita tulostuskoodi tänne
    }

}
