/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author juhassio
 */
public class Lypsyrobotti {
    private Maitosailio sailio;
    
    public Lypsyrobotti() {
        
    }
    
    public Maitosailio getMaitosailio(){
        if(sailio != null) {
            return sailio;
        }
        return null;
        
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        this.sailio = maitosailio;
    }
    
    public void lypsa(Lypsava lypsava) {
        try {
            double maara = lypsava.lypsa();
            sailio.lisaaSailioon(maara);
        } catch (Exception e) {
            System.out.println("Maidot menevät hukkaan!");
        }
    }
}

