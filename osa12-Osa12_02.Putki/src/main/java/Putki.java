
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
public class Putki<T> {

    private ArrayList<T> putki;

    public Putki() {
        this.putki = new ArrayList<>();

    }

    public void lisaaPutkeen(T arvo) {
        putki.add(arvo);

    }

    public T otaPutkesta() {
        if (putki.isEmpty()) {
            return null;

        } else {
            T remove = this.putki.get(0);
            putki.remove(remove);
            return remove;

        }

    }

    public boolean onkoPutkessa() {
        if (putki.isEmpty()) {
            return false;
        }
        return true;
    }

}
