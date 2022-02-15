/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class CDLevy implements Talletettava {

    private String artisti;
    private String levynNimi;
    private int julkaisuVuosi;
    private Double paino;

    public CDLevy(String artisti, String levynNimi, int julkaisuVuosi) {
        this.artisti = artisti;
        this.levynNimi = levynNimi;
        this.julkaisuVuosi = julkaisuVuosi;
        this.paino = 0.1;

    }

    @Override
    public double paino() {
        return 0.1;

    }
    
    
    public String toString() {
        return this.artisti + ": " + this.levynNimi + " (" + this.julkaisuVuosi + ")";
    }

}
