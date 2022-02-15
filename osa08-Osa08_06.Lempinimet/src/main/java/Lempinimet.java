
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap <String,String> nimet = new HashMap<>();
        nimet.put("Matti ", "Mage");
        nimet.put("Mikael", "Mixu");
        nimet.put("Artto", "Arppa");
        nimet.put("Matt", "Mattias");
        
        System.out.println(nimet.get("Mikael"));
        System.out.println(nimet.get("Matt"));
    }

}
