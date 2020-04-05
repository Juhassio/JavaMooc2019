
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        
        for (int i = 0; i < taulukko.length; i++){
            if(i > 0){
                
            
            System.out.print(", ");
            
            }
            System.out.print(taulukko[i]);
            
        }
        
            
        // Kirjoita koodia tänne
    
    }
}
