public class Heizung {
    private  boolean eingeschaltet;
    private Raum raum;

    public Heizung(Raum raum) {
    }

    public void schalteEin() {
        eingeschaltet = true;
    }

    public void schalteAus() {
        eingeschaltet = false;
    }

    public boolean isEingeschalte() {
        return eingeschaltet;
    }
}