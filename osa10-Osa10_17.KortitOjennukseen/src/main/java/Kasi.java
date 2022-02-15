
import java.util.ArrayList;
import java.util.Collections;
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
public class Kasi implements Comparable<Kasi> {

    private ArrayList<Kortti> lista;
    
    public Kasi() {
        this.lista = new ArrayList<>();
    }

    public void lisaa(Kortti kortti) {
        lista.add(kortti);
    }

    public List<Kortti> getKasi() {
        return this.lista;
    }

    public void tulosta() {
        Iterator<Kortti> iteraattori = lista.iterator();

        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());

        }
    }

    public int getSumma() {
        int summa = 0;
        return (this.lista.stream().mapToInt(k -> k.getArvo()).sum());
    }

    public void jarjesta() {
       Collections.sort(this.lista);

    }

    public void jarjestaMaittain() {
        Collections.sort(this.lista, new SamatMaatVierekkainArvojarjestykseen());
    }

    public int compareTo(Kasi k) {
        return this.getSumma() - k.getSumma();

    }
}
