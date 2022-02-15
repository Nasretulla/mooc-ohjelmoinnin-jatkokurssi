
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
public class YhdenTavaranLaatikko extends Laatikko {

    public YhdenTavaranLaatikko() {
        this.tavarat = new ArrayList<>();

    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (int i = 0; i < tavarat.size(); i++) {
            if (tavara.equals(tavarat.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavarat.isEmpty()) {
            this.tavarat.add(tavara);

        }

    }

}
