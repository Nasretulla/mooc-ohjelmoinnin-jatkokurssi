
import java.util.ArrayList;
import java.util.HashMap;

public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;
    

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();

    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!(omistajat.containsKey(rekkari))) {
            omistajat.put(rekkari, omistaja);
            return true;

        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            return omistajat.get(rekkari);

        }

        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            omistajat.remove(rekkari);
            return true;

        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        //System.out.println(omistajat.get(this.rekis));
        for(Rekisterinumero rekkari : omistajat.keySet()){
            System.out.println(rekkari);
        
        }

    }

   public void tulostaOmistajat() {
        ArrayList<String> lista = new ArrayList<>();
        
        for(String omistaja : omistajat.values()){
            if (!(lista.contains(omistaja))){
                System.out.println(omistaja);
                lista.add(omistaja);
                
            }
        
            
        }
    }
    
    
}
