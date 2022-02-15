/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Opiskelija extends Henkilo {

    private int opintopisteita;

    public Opiskelija(String name, String osoite) {
        super(name, osoite);
        
        
    }

    public void opiskele() {
        this.opintopisteita++;

    }

    public int opintopisteita() {
        return this.opintopisteita;

    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + this.opintopisteita;
    }
    
    

}
