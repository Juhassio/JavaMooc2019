
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    
    public void lisaaAteria(String ateria){
        
        
        if(!ateriat.contains(ateria)){
            ateriat.add(ateria);
        }
    }
    
    public void tulostaAteriat(){
        int indeksi = 0;
        while (indeksi < this.ateriat.size()){
            String ateria = this.ateriat.get(indeksi);
            System.out.println(ateria);
            indeksi++;
        }
        
        
    }
    
    public void tyhjennaRuokalista(){
        ateriat.clear();
    }
}

