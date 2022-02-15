
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.isEmpty()) {
                break;
                
            }
            lista.add(mjono);
            
            
        }
        lista.stream()
                    .forEach(listaus -> System.out.println(listaus));
        
    }
}
