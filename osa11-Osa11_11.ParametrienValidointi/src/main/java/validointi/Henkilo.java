package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

        if (nimi == null|| nimi.equals("") || nimi.length() > 40) {
            throw new IllegalArgumentException("nimi on väärä");

        }
        
        if (ika < 0 || ika > 120){
        throw new IllegalArgumentException("ikä on väärä");
        }
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
