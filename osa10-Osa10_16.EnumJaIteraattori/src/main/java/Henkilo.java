/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Henkilo {

    private Koulutus koulutus;
    private String nimi;

    public Henkilo(String nimi, Koulutus koulutus) {
        this.nimi = nimi;
        this.koulutus = koulutus;

    }

    public Koulutus getKoulutus() {
        return this.koulutus;

    }
    @Override
    public String toString() {
        return nimi + ", " + koulutus;
    }

}
