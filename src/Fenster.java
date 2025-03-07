public class Fenster {
    private boolean offen;

    private Raum raum;

    public Fenster(Raum raum) {
        this.raum = raum;
    }

    public void oeffneFenster() {
        for (Heizung heizung : raum.getHeizungliste()) {
            heizung.schalteAus();
        }
        offen = true;
    }

    public void schliesseFenster() {
        offen = false;
    }

    public boolean isOffen() {
        return offen;
    }

    public Raum getRaum() {
        return raum;
    }
}
