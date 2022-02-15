
import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {

    private HashMap<String, ArrayList<String>> tavarat;

    public Kellari() {
        this.tavarat = new HashMap<>();

    }

    public void lisaa(String komero, String tavara) {
        this.tavarat.putIfAbsent(komero, new ArrayList<>());
        tavarat.get(komero).add(tavara);

    }

    public ArrayList<String> sisalto(String komero) {
        if (tavarat.containsKey(komero)) {
            return tavarat.get(komero);

        }

        return new ArrayList<>();

    }

    public void poista(String komero, String tavara) {

        if (this.tavarat.get(komero).contains(tavara)) {
            this.tavarat.get(komero).remove(tavara);

            if (this.tavarat.get(komero).isEmpty()) {
                this.tavarat.remove(komero);
                this.komerot();
            }
        }
    }

    public ArrayList<String> komerot() {

        ArrayList<String> komeroo = new ArrayList<>();

        for (String komeronNimi : this.tavarat.keySet()) {
           
                komeroo.add(komeronNimi);

            
        }
        return komeroo;
    }

}
