
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasretulla
 */
import java.util.ArrayList;

public  class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimiPaino;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimiPaino = maksimipaino;
        this.tavarat = new ArrayList<>();

    }

    public int tavaranPaino() {
        int tavaranpaino = 0;
        for (int i = 0; i < this.tavarat.size(); i++) {
            tavaranpaino += tavarat.get(i).getPaino();

        }
        return tavaranpaino;
    }
    
    @Override
    public void lisaa(Tavara tavara){
        if(!(this.tavaranPaino() + tavara.getPaino()  > this.maksimiPaino)){
            tavarat.add(tavara);
        
        }
    
    }
   @Override
    public boolean onkoLaatikossa(Tavara tavara) {
    for (int i = 0; i < tavarat.size(); i++) {
            if (tavara.equals(tavarat.get(i))) 
                return true;
        }
        return false;
    }
    
}
