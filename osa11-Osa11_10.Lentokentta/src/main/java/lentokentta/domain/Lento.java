/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.domain;

/**
 *
 * @author Nasretulla
 */
public class Lento {

    private Lentokone lentokone;
    private Paikka lahtopaikka;
    private Paikka kohdepaikka;

    public Lento(Lentokone lentokone, Paikka lahtopaikka, Paikka kohdepaikka) {
        this.lentokone = lentokone;
        this.lahtopaikka = lahtopaikka;
        this.kohdepaikka = kohdepaikka;

    }

    public Lentokone getLentokone() {
        return this.lentokone;

    }

    public Paikka getLahtopaikka() {
        return this.lahtopaikka;

    }

    public Paikka getKohdepaikka() {
        return this.kohdepaikka;
    }

    public String toString() {
        return this.lentokone + " (" + this.lahtopaikka + "-" + this.kohdepaikka + ")";
    }

}
