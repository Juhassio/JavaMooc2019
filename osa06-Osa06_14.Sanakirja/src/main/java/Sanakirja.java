import java.util.ArrayList;
import java.util.HashMap;


public class Sanakirja {
    private HashMap<String, String> sanat;

    public Sanakirja() {
        this.sanat = new HashMap<String, String>();
    }
    
    public String kaanna(String sana) {
        if(this.sanat.containsKey(sana)){
            return this.sanat.get(sana);
        }
        return null;
    }
    
    public void lisaa(String sana, String kaannos){
        this.sanat.put(sana, kaannos);
    }
    
    public int sanojenLukumaara(){
        return this.sanat.size();
    }
    
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> kaikkisanat = new ArrayList<String>();
        for(String avain : this.sanat.keySet()){
             String merkkijono = avain + " = " + this.sanat.get(avain);
             kaikkisanat.add(merkkijono);
        }
        return kaikkisanat;
    }
}