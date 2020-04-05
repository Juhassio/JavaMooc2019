
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava){
        if(this.nelioita > verrattava.nelioita){
            return true;
        }
        return false;
    }
    
    public int hintaero(Asunto verrattava){
        int hintaero = this.neliohinta * this.nelioita;
        int verrattavaHintaero = verrattava.neliohinta * verrattava.nelioita;
        
        return Math.abs(hintaero - verrattavaHintaero);
        
        
    }
    
    public boolean kalliimpi(Asunto verrattava){
        if (this.neliohinta * this.nelioita > verrattava.neliohinta * verrattava.nelioita){
            return true;
        }
        return false;
    }
}
