
import java.util.ArrayList;
 
public class Tehtavienhallinta {
 
    private ArrayList<Tehtava> tehtavat;
 
    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }
 
    public ArrayList<String> tehtavalista() {
        ArrayList<String> lista = new ArrayList<>();
        for (Tehtava tehtava : tehtavat) {
            lista.add(tehtava.getNimi());
        }
 
        return lista;
    }
 
    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }
 
    public void merkkaaTehdyksi(String tehtava) {
        for (Tehtava t : tehtavat) {
            if (t.getNimi().equals(tehtava)) {
                t.setTehty(true);
            }
        }
    }
 
    public boolean onTehty(String tehtava) {
        for (Tehtava t : tehtavat) {
            if (t.getNimi().equals(tehtava) && t.onTehty()) {
                return true;
            }
        }
 
        return false;
    }
}
