
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juhassio
 */
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.sanakirja = new Sanakirja();
        this.lukija = lukija;
        
    }
    public void kaynnista(){
        
    
       
    
        
         System.out.println("Komennot:\n  lisaa - lisää sanaparin sanakirjaan\n  kaanna - kysyy sanan ja tulostaa sen käännöksen\n  lopeta - poistuu käyttöliittymästä");
         System.out.println("");
         
         while(true){
             System.out.print("Komento: ");
             String komento = lukija.nextLine();
             if(komento.equalsIgnoreCase("lopeta")){
                 System.out.println("Hei hei!");
                 break;
             
             }else if(komento.equalsIgnoreCase("lisaa")){
                 System.out.print("Suomeksi: ");
                 String suo = lukija.nextLine();
                 System.out.print("Käännös: ");
                 String kaa = lukija.nextLine();
                 System.out.println("");
                 sanakirja.lisaa(suo, kaa);
             }else if(komento.equalsIgnoreCase("kaanna")){
                 System.out.print("Anna sana: ");
                 String kaa = lukija.nextLine();
                 System.out.print("Käännös: ");
                 System.out.println(sanakirja.kaanna(kaa));
                System.out.println("");
             }else{
                 System.out.println("Tuntematon komento.");
                 System.out.println("");
             }
         }
     
         
         
    }
}
    

