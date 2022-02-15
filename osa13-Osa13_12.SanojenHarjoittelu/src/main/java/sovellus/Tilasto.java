/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author Nasretulla
 */
public class Tilasto {

    private Sanakirja sanakirja;
    private int arvauksia;
    private int oikein;

    public Tilasto(Sanakirja sanakirja, int arvauksia, int oikein) {
        this.sanakirja = sanakirja;
        this.arvauksia = 0;
        this.oikein = 0;

    }

    public int getArvauksia() {
        return this.arvauksia;

    }

    public int getOikein() {
        return this.oikein;
    }

    public int kasvataArvauksia() {
        return this.arvauksia++;
    }

    public int getOikeatVastaukse() {
        return this.oikein++;
    }

    public int getSanoja() {
        return this.sanakirja.sanoja();
    }
}
