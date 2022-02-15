
import java.util.ArrayList;



public class Paaohjelma {

    public static void main(String[] args) {
        Opiskelija eka = new Opiskelija("jamo");
      Opiskelija toka = new Opiskelija("jamo1");
       System.out.println(eka.compareTo(toka));
       
       
       ArrayList<Opiskelija> opiskelija = new ArrayList<>();
       
       opiskelija.add(new Opiskelija("timo"));
       opiskelija.add(new Opiskelija("kimo"));
       opiskelija.add(new Opiskelija("kiko"));
       opiskelija.stream().sorted().forEach(k -> System.out.println(k));
       
       
       
               
    }
}
