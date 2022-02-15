
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista tehtavalista;
    

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;

    }

    public void kaynnista() {

        while (true) {
            System.out.println("Komento: ");
            System.out.println("lisaa listaan, listaa, pooista");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                System.out.println("kiitos hei!");
                break;

            }

            if(komento.equals("lisaa listaan")) {
                System.out.println("Lisättävä: ");
                String lisattava = lukija.nextLine();
                tehtavalista.lisaa(lisattava);

            } else if (komento.equals("listaa")) {
                tehtavalista.tulosta();

            } else if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int pois = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(pois);

            }

        }

    }

}
