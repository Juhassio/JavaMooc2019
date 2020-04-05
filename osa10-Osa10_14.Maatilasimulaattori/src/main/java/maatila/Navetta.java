package maatila;

/**
 *
 * @author juhassio
 */
import java.util.List;
import java.lang.Math;

public class Navetta {
    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;
    
    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio() {
        return maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(maitosailio);
    }
    
    public void hoida(Lehma lehma) {
        if (lypsyrobotti == null) {
            throw new IllegalArgumentException("Ei lypsyrobottia asennettu!");
        } else {   
            lypsyrobotti.lypsa(lehma);
        }
    }
    
    public void hoida(List<Lehma> lehmat) {
        if (lypsyrobotti == null) {
            throw new IllegalArgumentException("Ei lypsyrobottia asennettu!");
        } else {   
            for (Lehma l: lehmat) {
                lypsyrobotti.lypsa(l);
            }
        }
    }
    
    public String toString() {
        return Math.ceil(maitosailio.getSaldo() * 100 / 100) + "/" + maitosailio.getTilavuus();
    }
}