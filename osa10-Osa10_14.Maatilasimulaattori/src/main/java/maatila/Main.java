package maatila;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Testaa täällä ohjelmaasi
        
        Navetta navetta = new Navetta(new Maitosailio());
System.out.println("Navetta: " + navetta);

Lypsyrobotti robo = new Lypsyrobotti();
navetta.asennaLypsyrobotti(robo);

Lehma ammu = new Lehma();
ammu.eleleTunti();
ammu.eleleTunti();

navetta.hoida(ammu);
System.out.println("Navetta: " + navetta);

List<Lehma> lehmaLista = new ArrayList<>();
lehmaLista.add(ammu);
lehmaLista.add(new Lehma());

for (Lehma lehma: lehmaLista) {
    lehma.eleleTunti();
    lehma.eleleTunti();
};

navetta.hoida(lehmaLista);
System.out.println("Navetta: " + navetta);
    }
}
