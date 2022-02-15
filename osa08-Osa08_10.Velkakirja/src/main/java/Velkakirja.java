
import java.util.HashMap;

public class Velkakirja {

    private HashMap<String, Double> velka;

    public Velkakirja() {
        this.velka = new HashMap<>();

    }

    public void asetaLaina(String kenelle, double maara) {
        velka.put(kenelle, maara *1.0);

    }

    public double paljonkoVelkaa(String kuka) {
        

        return this.velka.getOrDefault(kuka, 0.0);
    }

}
