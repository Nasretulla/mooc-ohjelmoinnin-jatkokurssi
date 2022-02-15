/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.logiikka;


import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone;
import java.util.HashMap;
import java.util.Map;
import lentokentta.domain.Paikka;

/**
 *
 * @author Nasretulla
 */
public class Lentohallinta {

    private Map<String, Lentokone> lentokoneet;
    private Map<String, Lento> lennot;
    private Map<String, Paikka> paikat;

    public Lentohallinta() {
        this.lennot = new HashMap<>();
        this.lentokoneet = new HashMap<>();
        this.paikat = new HashMap<>();
    }

    public void lisaaLentokone(String tunnus, int kapasiteetti) {
        Lentokone lentokone = new Lentokone(tunnus, kapasiteetti);
        this.lentokoneet.put(tunnus, lentokone);

    }

    public void lisaaLento(Lentokone lentokone, String lahtoTunnus, String kohdeTunnus) {
        this.paikat.putIfAbsent(lahtoTunnus, new Paikka(lahtoTunnus));
        this.paikat.putIfAbsent(kohdeTunnus, new Paikka(kohdeTunnus));

        Lento lento = new Lento(lentokone, this.paikat.get(lahtoTunnus), this.paikat.get(kohdeTunnus));
        this.lennot.put(lento.toString(), lento);

    }

    public void tulostaLentokoneet() {
        for (String lentokone : lentokoneet.keySet()) {
            System.out.println(lentokoneet.get(lentokone));

        }
    }

    public void tulostaLento() {
        for (String lento : lennot.keySet()) {
            System.out.println(lennot.get(lento));
        }
    }

    public Lentokone tulostaTiedot(String tunnus) {
        return this.lentokoneet.get(tunnus);
    }
}
