/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Nasretulla
 */
public class Keskiarvosensori implements Sensori {

    private ArrayList<Sensori> sensori;
    private ArrayList<Integer> tulokset;

    public Keskiarvosensori() {
        this.sensori = new ArrayList<>();
        this.tulokset = new ArrayList<>();

    }

    public void lisaaSensori(Sensori lisattava) {
        sensori.add(lisattava);
    }
    @Override
    public boolean onPaalla() {
        for (Sensori s : sensori) {
            if (s.onPaalla() == false) {
                return false;
            }

        }

        return true;
    }

    @Override
    public void paalle() {
        for (Sensori s : sensori) {
            if (s.onPaalla() == false) {
                s.paalle();
            }

        }
    }

    @Override
    public void poisPaalta() {
        sensori.get(new Random().nextInt(sensori.size())).poisPaalta();

    }

    @Override
    public int mittaa() {
        if (sensori.isEmpty()) {
            throw new IllegalStateException("Ei mittareita");

        }

       //if (this.onPaalla() == false) {
          //  throw new IllegalStateException("kaikki sensorit ei ole päällä");
       // }

        int tulos = (int) sensori.stream().mapToInt(s -> s.mittaa()).average().getAsDouble();
        tulokset.add(tulos);
        return tulos;

    }
    public List<Integer> mittaukset(){
        return this.tulokset;
    }

}
