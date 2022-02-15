/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Kirja implements Talletettava {

    private String kirjoitaja;
    private String kirjanNimi;
    private Double kirjanPaino;

    public Kirja(String kirjoitaja, String kirjanNimi, double kirjanPaino) {
        this.kirjoitaja = kirjoitaja;
        this.kirjanNimi = kirjanNimi;
        this.kirjanPaino = kirjanPaino;

    }

    @Override
    public double paino() {
        return this.kirjanPaino;
    }
    
    @Override
    public String toString(){
        return this.kirjoitaja + ": " + this.kirjanNimi;
    
    }
}
