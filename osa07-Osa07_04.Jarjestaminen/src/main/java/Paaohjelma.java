
import java.util.ArrayList;
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        
       int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
        
        
        
        
        
        // tee testikoodia tänne
        //int[] taulukko = {3, 1, 5, 99, 3, 12};
        //System.out.println("Pienin: " + pienin(taulukko));
        //System.out.println("Pienimmän indeksi: " + pienimmanIndeksi(taulukko));
        
        //int[] luvut = {6, 5, 8, 7, 11};
        //System.out.println(pienimmanIndeksi(luvut));
       // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 0));
       // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 1));
       // System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(luvut, 2));
        
        
        
    }
    
    
    public static int pienin(int[]taulukko){
        int pienin = taulukko[0];

        for (int i = 1; i < taulukko.length - 1; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    
    }
    
    public static int pienimmanIndeksi(int[] taulukko){
        int pienin = pienin(taulukko);
        for (int i = 0; i < taulukko.length - 1; i++) {
            if (taulukko[i] == pienin) {
                return i;
            }
        }
        return -1;
    
    }
    
    public static int pienimmanIndeksiAlkaen(int[]taulukko, int aloitusIndeksi){
         int pienin = taulukko[aloitusIndeksi];
        int pienin2 = aloitusIndeksi;

        for (int i = aloitusIndeksi + 1; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                pienin2 = i;
            }
        }

        return pienin2;

    }
    
    public static void vaihda(int[]taulukko, int indeksi1, int indeksi2){
        int a = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = a;
        
        
    }
    
    public static void jarjesta(int[] taulukko) {
        
        for (int i=0; i < taulukko.length-1; ++i) 
       for (int j=i+1; j < taulukko.length; ++j)
         if (taulukko[i] > taulukko[j]) { 
            int apu = taulukko[i];
            taulukko[i] = taulukko[j];
            taulukko[j] = apu;
             System.out.println(Arrays.toString(taulukko));
        
         }
        
    }

}
