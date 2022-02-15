package lentokentta;

import lentokentta.logiikka.Lentohallinta;
import lentokentta.ui.Tekstikayttoliittyma;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija = new Scanner(System.in);
        Tekstikayttoliittyma start = new Tekstikayttoliittyma(new Lentohallinta(), lukija);
       start.kaynnista();
        
    }
}
