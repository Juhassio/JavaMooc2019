public class Maksukortti {
    private double saldo;
    
    
    public Maksukortti(double alkusaldo){
        this.saldo = alkusaldo;
    }
    
    public String toString(){
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    public void syoEdullisesti(){
        if(this.saldo >= 2.60){
            this.saldo = this.saldo - 2.60;
        } else {
            this.saldo = this.saldo;
        }
    }
    
    public void syoMaukkaasti(){
        if(this.saldo >= 4.60){
            this.saldo = this.saldo - 4.60;
        } else {
            this.saldo = this.saldo;
        }
    }
    
    public void lataaRahaa(double rahamaara){
        if(rahamaara > 0){
            if(this.saldo + rahamaara <= 150){
                this.saldo = this.saldo + rahamaara;
            } else {
                this.saldo = 150;
            
            }
            
        }
        
    }
    
}
