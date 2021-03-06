
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Ostos {

    private String tuote;
    private int kpl;
    private int yksikkohinta;

    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;

    }

    public int hinta() {
        
        return this.kpl * this.yksikkohinta;
    }
    public void kasvataMaaraa(){
        this.kpl++;
    
    }
    
    public String toString(){
    
        return this.tuote + ": " +  this.kpl;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tuote);
        hash = 53 * hash + this.kpl;
        hash = 53 * hash + this.yksikkohinta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ostos other = (Ostos) obj;
        
        if (this.yksikkohinta != other.yksikkohinta) {
            return false;
        }
        if (!Objects.equals(this.tuote, other.tuote)) {
            return false;
        }
        return true;
    }
    
}
