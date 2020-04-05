/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juhassio
 */
public class MuistavaSanakirja {
    private Map<String, String> sanakirja;
    private String tiedosto;
    
    public MuistavaSanakirja(){
        sanakirja = new HashMap<>();
        
        
        
        
    }
    
    public MuistavaSanakirja(String tiedosto){
        this.tiedosto = tiedosto;
        this.sanakirja = new HashMap<>();
        
    }
    
    public boolean lataa(){
        
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(l -> l.split(":"))
                    .forEach(osat -> {
                        sanakirja.put(osat[0], osat[1]);
                        sanakirja.put(osat[1], osat[0]);
                                
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
        
        
        
    }
    
    public boolean tallenna(){
        
        try(PrintWriter k = new PrintWriter(tiedosto)){
            for(String sana : sanakirja.keySet()){
                k.write(sana + ":" + sanakirja.get(sana) + "\n");
            }
            k.close();
            return true;
            
        } catch (Exception ex) {
            System.out.println("Virhe");
            return false;
        }
        
    }
    
    
    
    
    public void lisaa(String sana, String kaannos){
        sanakirja.putIfAbsent(sana, kaannos);
        
    }
    public String kaanna(String sana){
        
        for(String s: sanakirja.keySet()){
            if(sana.equals(s)){
                return sanakirja.get(s);
            } else if(sana.equals(sanakirja.get(s))){
                return s;
            }
            
            
        }
        return null;
      
    }
    
    public void poista(String sana){
        if(sanakirja.containsKey(sana)){
            sanakirja.remove(sana);
        } else if (sanakirja.containsKey(kaanna(sana))){
            sanakirja.remove(kaanna(sana));
        }
        
    }
    
    
    
    
    
    
}