
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        List<Kirja> kirja = new ArrayList<>();

        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) 
                break;
            
            System.out.println("Syötä kirjan pienin kohdeikä:");
            int ika = Integer.valueOf(lukija.nextLine());
            kirja.add(new Kirja(nimi, ika));
        }

        System.out.println("Yhteensä " + kirja.size() + " kirjaa.");
        System.out.println("Kirjat: ");
        
        
        Comparator<Kirja>vertailija = Comparator
                .comparing(Kirja::getIka)
                .thenComparing(Kirja::getNimi);
        Collections.sort(kirja, vertailija);
        kirja.stream().forEach(k -> System.out.println(k));

    }
    

}
