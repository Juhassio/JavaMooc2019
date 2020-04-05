/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class MuistavaTuotevarasto extends Tuotevarasto {
    //private double alkuSaldo;
    private Muutoshistoria muutoshistoria = new Muutoshistoria();
    

    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        //this.alkuSaldo = alkuSaldo;
        muutoshistoria.lisaa(alkuSaldo);
        super.lisaaVarastoon(alkuSaldo);
       
       
        
        
    }
    
    public String historia(){
        return muutoshistoria.toString();
        
    }
    
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(getSaldo());
        
    }
    
    public double otaVarastosta(double maara){
        double poisto = super.otaVarastosta(maara);
        muutoshistoria.lisaa(getSaldo());
        return poisto;
        
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " +  super.getNimi());
        System.out.println("Historia: " + historia());
        System.out.println("Suurin tuotemäärä: " + muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + muutoshistoria.keskiarvo());
    }
    
}
