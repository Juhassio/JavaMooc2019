
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true){
            int numero = lukija.nextInt();
            if(numero < 0){
                break;
            }
            
            lista.add(numero);
        }
        
        lista.stream()
                .filter(n -> n >=1 && n <= 5)
                .forEach(s -> System.out.println(s));

    }
}
