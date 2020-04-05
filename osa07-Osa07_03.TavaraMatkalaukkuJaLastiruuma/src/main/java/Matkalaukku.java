import java.util.ArrayList;

public class Matkalaukku {

    private int maksimiPaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.tavarat = new ArrayList<Tavara>();
    }

    public void lisaaTavara(Tavara tavara) {
        int paino = 0;
        
        for (Tavara tavaroita : this.tavarat) {
            paino = paino + tavaroita.getPaino();
        }
        
        if ((paino + tavara.getPaino()) <= this.maksimiPaino) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public String toString() {
        
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }
        
        if (this.tavarat.size() == 1) {
            return "1 tavara" + " (" + this.tavarat.get(0).getPaino() + " kg)";
        }
        
        int paino = 0;
        
        for (Tavara tavaroita : this.tavarat) {
            paino = paino + tavaroita.getPaino();
        }
        
        return "" + this.tavarat.size() + " tavaraa " + "(" + paino + " kg)";
    }

    public void tulostaTavarat() {
        for (Tavara tavaroita : this.tavarat) {
            System.out.println(tavaroita.toString());
        }
    }

    public int yhteispaino() {
        int paino = 0;
        
        for (Tavara tavara : this.tavarat) {
            paino = paino + tavara.getPaino();
        }
        
        return paino;
    }

    public Tavara raskainTavara() {
        
        if (this.tavarat.isEmpty()) {
            return null;
        }
        
        Tavara tavaroita = new Tavara("tavara", 0);
        for (Tavara tavara : this.tavarat) {
            
            if (tavara.getPaino() > tavaroita.getPaino()) {
                tavaroita = tavara;
            }
        }
        
        return tavaroita;
    }
}
