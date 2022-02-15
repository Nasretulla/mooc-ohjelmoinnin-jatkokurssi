
import java.util.HashMap;

public class Lyhenteet {

    HashMap<String, String> map;

    public Lyhenteet() {
        this.map = new HashMap<>();

    }

    public void lisaaLyhenne(String lyhenne, String selite) {
        map.put(lyhenne, selite);

    }

    public boolean onkoLyhennetta(String lyhenne) {
        if (map.containsKey(lyhenne)) {
            return true;

        }
        return false;
    }

    public String haeLyhenne(String lyhenne) {

        return this.map.get(lyhenne);

    }

}
