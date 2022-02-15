package sanakirja;

public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        MuistavaSanakirja sanakirja = new MuistavaSanakirja("sanat.txt");
        sanakirja.lataa();


        sanakirja.tallenna();
    }
}
