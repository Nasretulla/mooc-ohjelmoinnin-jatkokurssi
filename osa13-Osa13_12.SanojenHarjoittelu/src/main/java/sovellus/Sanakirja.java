/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Nasretulla
 */
public class Sanakirja {

    private List<String> sanat;
    private Map<String, String> kaannokset;

    public Sanakirja() {
        this.sanat = new ArrayList<>();
        this.kaannokset = new HashMap<>();

        lisaa("sana", "Kaannös");
    }

    public String hae(String sana) {
        return this.kaannokset.get(sana);

    }

    public void lisaa(String sana, String kaannos) {
        if (!this.kaannokset.containsKey(sana)) {
            this.sanat.add(sana);

        }

        this.kaannokset.put(sana, kaannos);
    }

    public String arvoSana() {

        Random satunainen = new Random();

        return this.sanat.get(satunainen.nextInt(this.sanat.size()));
    }

    public int sanoja() {
        return this.sanat.size();
    }
}
