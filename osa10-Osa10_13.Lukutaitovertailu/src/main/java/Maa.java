/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Maa implements Comparable<Maa> {

    private String maanNimi;
    private int Vuosi;
    private String sukupuoli;
    private double Prosentti;

    public Maa(String nimi, int vuosi, String sukupuoli, double prosentti) {
        this.maanNimi = nimi;
        this.Vuosi = vuosi;
        this.sukupuoli = sukupuoli;
        this.Prosentti = prosentti;
    }

    public String getNimi() {
        return this.maanNimi;

    }

    public int getVuosi() {
        return this.Vuosi;
    }

    public String getSukupuoli() {
        return sukupuoli;

    }

    public Double getProsentti() {
        return this.Prosentti;
    }

    @Override
    public String toString() {
        return this.maanNimi + " (" + this.Vuosi + "), " + this.sukupuoli + ", " + this.Prosentti;
    }

    public int compareTo(Maa k) {
        if (this.Prosentti < k.getProsentti()) {
            return -1;
        }
        if (this.Prosentti > k.getProsentti()) {
            return 1;
        } else {
            return 0;
        }

    }

}
