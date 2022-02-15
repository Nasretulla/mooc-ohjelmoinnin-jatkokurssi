
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja    
        Scanner lukija = new Scanner(System.in);
        Tarkistin tarkista = new Tarkistin();
        
        System.out.println("Anna merkkijono: ");
        String mjono = lukija.nextLine();
        
        System.out.println(tarkista.kellonaika(mjono));
        
    }
}
