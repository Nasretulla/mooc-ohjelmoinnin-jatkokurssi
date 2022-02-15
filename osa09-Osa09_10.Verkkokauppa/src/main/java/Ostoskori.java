
import java.util.ArrayList;
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
public class Ostoskori {

    private List<Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new ArrayList<>();

    }

    public void lisaa(String tuote, int hinta) {
        int maara = 0;

        Ostos ostos = new Ostos(tuote, 1, hinta);

        if (this.ostokset.contains(ostos)) {
            this.ostokset.get(this.ostokset.indexOf(ostos)).kasvataMaaraa();
        } else {
            this.ostokset.add(ostos);
        }

    }

    public int hinta() {

        int hinta = 0;

        for (int i = 0; i < this.ostokset.size(); i++) {
            hinta = hinta + this.ostokset.get(i).hinta();

        }

        return hinta;
    }

    public void tulosta() {

        for (Ostos ostos : this.ostokset) {
            System.out.println(ostos);
        }

    }

    

}
