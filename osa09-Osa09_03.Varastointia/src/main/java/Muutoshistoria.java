
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
public class Muutoshistoria {

    private ArrayList<Double> muisti;

    public Muutoshistoria() {
        this.muisti = new ArrayList<>();

    }

    public void lisaa(double tilanne) {
        muisti.add(tilanne);

    }

    public void nollaa() {
        this.muisti.clear();
    }

    public double minArvo() {
        if (this.muisti.isEmpty()) {
            return 0;

        }
        double min = this.muisti.get(0);
        for (int i = 1; i < this.muisti.size(); i++) {
            if (this.muisti.get(i) < min) {
                min = muisti.get(i);

            }

        }

        return min;

    }

    public double keskiarvo() {
        if (this.muisti.isEmpty()) {
            return 0;

        }
        double summa = 0.0;
        for (int i = 0; i < this.muisti.size(); i++) {
            summa += this.muisti.get(i);

        }
        return summa / this.muisti.size();
    }

    public double maxArvo() {
        if (muisti.isEmpty()) {
            return 0;

        }

        double max = this.muisti.get(0);
        for (int i = 1; i < muisti.size(); i++) {
            if (this.muisti.get(i) > max) {
                max = muisti.get(i);
            }

        }
        return max;
    }

   

@Override
    public String toString() {
        return muisti.toString();
    }
    
}
