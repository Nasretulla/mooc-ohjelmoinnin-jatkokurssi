
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasretulla
 */
public class Laatikko implements Talletettava {

    private double max;
    private ArrayList<Talletettava> tavaratLaatikossa;

    public Laatikko(double max) {
        this.max = max;
        this.tavaratLaatikossa = new ArrayList<>();

    }

    public double paino() {
        double paino = 0.0;
        for (Talletettava tavara : tavaratLaatikossa) {
            paino += tavara.paino();
        }
        return paino;
    }

    public void lisaa(Talletettava tavara) {
        if (this.paino() + tavara.paino() < max) {
            tavaratLaatikossa.add(tavara);

        }

    }


    @Override
    public String toString() {
        return "Laatikko: " + this.tavaratLaatikossa.size() + " esinettä," + " paino yhteensä " + this.paino() + " kiloa";

    }
}
