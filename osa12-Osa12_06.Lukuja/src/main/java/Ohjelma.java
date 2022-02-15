
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako satunnaislukua tulostetaan?: ");
        int luku = Integer.valueOf(lukija.nextInt());
        
        
        
       for(int i = 0; i < luku;i++){
           
           System.out.println(new Random().nextInt(11));
           
           
       }
        
    }

}
