
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasretulla
 */
public class Varasto {

    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldo;

    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldo = new HashMap<>();

    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldo.put(tuote, saldo);

    }

    public int hinta(String tuote) {
        if (hinnat.get(tuote) == null) {
            return -99;

        }

        return hinnat.get(tuote);
    }

    public int saldo(String tuote) {
        if (saldo.get(tuote) == null) {
            return 0;
        }
        return saldo.get(tuote);

    }
    

    public boolean ota(String tuote) {
        if (saldo.get(tuote)==null) {

            return false;

        }
        int saldo = this.saldo(tuote);
        saldo--;

        if (saldo < 0) {
            saldo = 0;
            this.saldo.put(tuote, saldo);
            return false;
        } else {
            this.saldo.put(tuote, saldo);

            return true;
        }
    }
    public Set<String> tuotteet(){
    
        return hinnat.keySet();
    }
}
