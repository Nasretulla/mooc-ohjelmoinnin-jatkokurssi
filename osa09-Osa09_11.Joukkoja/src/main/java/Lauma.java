
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasretulla
 */
public class Lauma implements Siirrettava {

    private ArrayList<Siirrettava> lista;

    public Lauma() {
        this.lista = new ArrayList<>();

    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lista.add(siirrettava);

    }

    public void siirra(int dx, int dy) {
        for (Siirrettava l : lista) {
            l.siirra(dx, dy);

        }

    }

    public String toString() {
        String palautettava = "";
        for (Siirrettava k: lista) {
            palautettava += k + "\n";
        }
        return palautettava;
    }
}