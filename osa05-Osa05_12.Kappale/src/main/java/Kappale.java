
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
    public boolean equals(Object verrattava){
        Kappale verrattavaKpl = (Kappale) verrattava;
        if(this.esittaja == verrattavaKpl.esittaja && this.nimi == verrattavaKpl.nimi && this.pituusSekunteina == verrattavaKpl.pituusSekunteina){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }
    
    


}
