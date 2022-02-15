/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Sivari implements Palvelusvelvollinen {

    private int paivia;

    public Sivari() {
        this.paivia = 362;

    }

    public int paiviaJaljella() {
        return this.paivia;

    }

    public void palvele() {
        if (this.paivia > 0) {
            this.paivia--;

        }

    }

}
