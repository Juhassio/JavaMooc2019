
public class Harjoitusapuri {
    private int ika;
    private int leposyke;
    
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;
    }
    
    public double tavoitesyke(double prosenttiaMaksimista){
        double maksimisyke = 206.3 - (0.711 * ika);
        
        double tavoite = (maksimisyke - leposyke) * (prosenttiaMaksimista) + leposyke;
        return tavoite;
        
        
    }
    
}
