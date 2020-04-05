
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int i = 0;
        while(i < maara){
            System.out.print("*");
       
            i++;
        }
        System.out.println("");
        // 22.1
        // 02-24.1
    }

    public static void tulostaTyhjaa(int maara) {
        int i = 0;
        while(i < maara){
            System.out.print(" ");
            i++;
        }
        
        // 02-24.1
    }

    public static void tulostaKolmio(int koko) {
        int i = 1;
        while(i <= koko){
            tulostaTyhjaa(koko -i);
            tulostaTahtia(i);
            i++;
       
        }
        
        // 02-24.2
    }

    public static void jouluKuusi(int korkeus) {
        int i = 0;
        while( i < korkeus){
            tulostaTyhjaa(korkeus - (i + 1));
            tulostaTahtia(2 * i +1);
            i++;
           
        }
        int n = 1;
        for(n = 1; n <3; n++){
            tulostaTyhjaa(korkeus -2);
            tulostaTahtia(3);
            
        }
        
        
        
       
    
        
        
        // 02-24.3
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
