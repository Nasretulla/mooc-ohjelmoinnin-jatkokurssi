
import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {

    private HashMap<String, ArrayList<String>> lista;

    public UseanKaannoksenSanakirja() {
        this.lista = new HashMap<>();

    }

    public void lisaa(String sana, String kaannos) {
        this.lista.putIfAbsent(sana, new ArrayList<>());

        this.lista.get(sana).add(kaannos);

    }

    public ArrayList<String> kaanna(String sana) {

        if(lista.containsKey(sana)){
            return lista.get(sana);
        
        }
       return new ArrayList<>();
        
    }

    public void poista(String sana) {
     this.lista.remove(sana);

    }

}
