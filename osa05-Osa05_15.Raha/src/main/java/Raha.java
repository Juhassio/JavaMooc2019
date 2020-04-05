
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }
    
    public Raha plus(Raha lisattava){
        Raha uusi = new Raha(euroa + lisattava.euroa, senttia + lisattava.senttia);
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava){
        
        boolean totuus = true;
        if(this.eurot() > verrattava.eurot()){
            totuus = false;
        } else if (this.eurot() < verrattava.eurot()){
            totuus = true;
        }
        
        if (this.eurot() == verrattava.eurot()){
            if (this.sentit() < verrattava.sentit()){
                totuus = true;
                
            }else if (this.sentit() > verrattava.sentit()){
                totuus = false;
            }
        
        }    
        return totuus;
        
        
        
        
    }
    public Raha miinus(Raha vahentaja){
        int eurovahentaja = this.euroa - vahentaja.euroa;
        int senttivahentaja = this.senttia - vahentaja.senttia;
    
        if(senttivahentaja < 0){
            eurovahentaja = eurovahentaja -1;
            senttivahentaja = 100 - Math.abs(vahentaja.senttia -this.senttia);
        }
        if (eurovahentaja < 0){
            eurovahentaja = 0;
            senttivahentaja = 0;
        }
        Raha uusiVahentaja = new Raha(eurovahentaja, senttivahentaja);
        return uusiVahentaja;
        
    }

}
