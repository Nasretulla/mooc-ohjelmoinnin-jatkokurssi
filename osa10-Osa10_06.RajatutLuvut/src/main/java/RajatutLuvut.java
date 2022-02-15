
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        while (true) {
            int i = lukija.nextInt();
            if (i < 0) {
                break;
                
            }
            lista.add(i);
            
        }
        lista.stream()
                .filter(luku -> luku >= 1 && luku <= 5)
                .forEach(listaus -> System.out.println(listaus));
        
    }
}
