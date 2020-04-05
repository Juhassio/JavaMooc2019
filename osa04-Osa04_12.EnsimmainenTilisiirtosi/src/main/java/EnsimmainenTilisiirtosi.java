
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        
        Tili matti = new Tili("Matin tili", 1000);
        Tili oma = new Tili("Oma tili", 0);
        
        matti.otto(100.0);
        oma.pano(100.0);
        
        System.out.println(matti.saldo());
        System.out.println(oma.saldo());
        
    }
}
