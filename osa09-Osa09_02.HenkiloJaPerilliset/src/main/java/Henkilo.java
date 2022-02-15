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

    private String name;
    private String osoite;

    public Henkilo(String name, String osoite) {
        this.name = name;
        this.osoite = osoite;

    }

    public String toString() {
        return this.name  + "\n  " + this.osoite;
    }
}
