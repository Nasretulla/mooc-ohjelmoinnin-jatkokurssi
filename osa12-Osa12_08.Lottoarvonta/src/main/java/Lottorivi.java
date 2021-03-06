
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        
        this.arvoNumerot();
       

    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
        
        
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();

        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        Random r = new Random();
        
        while(numerot.size() < 7){
            int luku = r.nextInt(40)+1;
            
            
            if(!this.sisaltaaNumeron(luku)){
                numerot.add(luku);
            
            }
        
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return this.numerot.contains(numero);
    }
}
