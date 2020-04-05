import java.util.ArrayList;

public class Lastiruuma {

    private int maksimiPaino;
    private ArrayList<Matkalaukku> matkalaukut;

    public Lastiruuma(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.matkalaukut = new ArrayList<Matkalaukku>();
    }

    public void lisaaMatkalaukku(Matkalaukku matkalaukku) {
        int paino = 0;
        
        for (Matkalaukku laukku : this.matkalaukut) {
            paino = paino + laukku.yhteispaino();
        }
        
        if ((paino + matkalaukku.yhteispaino()) <= this.maksimiPaino) {
            this.matkalaukut.add(matkalaukku);
        }
    }

    @Override
    public String toString() {
        int paino = 0;
        
        for (Matkalaukku matkalaukku : this.matkalaukut) {
            paino = paino + matkalaukku.yhteispaino();
        }
        
        return "" + this.matkalaukut.size() + " matkalaukkua " + "(" + paino + " kg)";
    }

    public void tulostaTavarat() {
        for (Matkalaukku matkalaukku : this.matkalaukut) {
            matkalaukku.tulostaTavarat();
        }
    }
}

