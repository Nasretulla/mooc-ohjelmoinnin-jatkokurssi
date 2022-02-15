
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasretulla
 */
public class Tyontekijat {

    ArrayList<Henkilo> henkilot;

    public Tyontekijat() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        henkilot.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        this.henkilot.addAll(lisattavat);

    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }

    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            Henkilo k = iteraattori.next();
            if (k.getKoulutus().equals(koulutus)) {
                System.out.println(k);

            }

        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus().equals(koulutus)) {
                iteraattori.remove();
            }

        }

    }

}
