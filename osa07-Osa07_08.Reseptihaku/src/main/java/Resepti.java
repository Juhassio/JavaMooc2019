import java.util.ArrayList;

public class Resepti {
    private String reseptiNimi;
    private int keittoAika;
    private ArrayList<String> raakaAineet;

    public Resepti(String reseptiNimi, int keittoAika, ArrayList<String> raakaAineet) {
        this.reseptiNimi = reseptiNimi;
        this.keittoAika = keittoAika;
        this.raakaAineet = raakaAineet;
    }
    
    public String getNimi() {
        return this.reseptiNimi;
    }
    
    public int getAika() {
        return this.keittoAika;
    }
    
    public ArrayList<String> getAineet() {
        return this.raakaAineet;
    }
    
    @Override
    public String toString() {
        return this.reseptiNimi + ", keittoaika: " + this.keittoAika;
    }
    
}