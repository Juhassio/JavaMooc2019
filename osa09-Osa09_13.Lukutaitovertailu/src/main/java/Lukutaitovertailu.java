
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
        List<Maat> lukutaito = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
                    .map(rivi -> new Maat(rivi[3], Integer.valueOf(rivi[4]), rivi[2].replace("(%)", "").trim(), Double.valueOf(rivi[5])))
                    .collect(Collectors.toCollection(ArrayList::new))
                    .forEach(maa -> lukutaito.add(maa) );
        
        } catch (Exception e){
            System.out.println("Virhe");
        }
        lukutaito.stream()
                 // Parempi..   
                //.sorted(Comparator.comparing(Maat :: getLukutaito)).collect(Collectors.toList())
                //.forEach(maa -> System.out.println(maa));
                .sorted((t1, t2) -> {
                if (t1.getLukutaito() > t2.getLukutaito()) {
                return 1;
            }
            if (t1.getLukutaito() < t2.getLukutaito()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
        
    
    
    
    
        
    

    

    


