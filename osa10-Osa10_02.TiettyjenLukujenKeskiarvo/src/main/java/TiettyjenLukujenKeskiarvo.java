
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> lista = new ArrayList<>();
        System.out.print("Kirjoita syötteitä, \"loppu\" lopettaa.");

        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;

            }
            lista.add(rivi);

        }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String syote = lukija.nextLine();
        char pVAIn = syote.charAt(0);

        if (pVAIn == 'n') {

            double negative = lista.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku <= 0)
                    .average()
                    .getAsDouble();

            System.out.println("Negatiivisten lukujen keskiarvo: " + negative);

        }
        if(pVAIn == 'p'){

        double positive = lista.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku > 0)
                .average()
                .getAsDouble();
        System.out.println("Positiivisten lukujen keskiarvo: " + positive);
        }
    }
}
