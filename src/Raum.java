import java.util.ArrayList;
import java.util.List;

public class Raum {
    private int raumId;

    private int zieltemperatur;

    private List<Fenster> fensterliste = new ArrayList<>();

    private List<Heizung> heizungliste = new ArrayList<>();

    private Thermometer thermometer;

    public Raum(int raumId, int zieltemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
    }

    public boolean hatOffeneFenster() {
        for (Fenster fenster:fensterliste) {
            if (fenster.isOffen()) {
                return true;
            }
        }
        return false;
    }

    public void regeleTemperatur() {
       int aktuelleTemperatur = this.thermometer.getTemperatur();
           if(hatOffeneFenster()) {
               for (Heizung heizung : heizungliste) {
                   heizung.schalteAus();
               }
           } else {
               if (aktuelleTemperatur >= zieltemperatur) {
                   for (Heizung heizung : heizungliste) {
                       heizung.schalteAus();
                   }
               } else {
                   for (Heizung heizung : heizungliste) {
                       heizung.schalteEin();
                   }
               }
           }
       }


    public List<Heizung> getHeizungliste() {
        return heizungliste;
    }

    public int getZieltemperatur() {
        return zieltemperatur;
    }

    public void setZieltemperatur(int zieltemperatur) {
        this.zieltemperatur = zieltemperatur;
    }

    @Override
    public String toString() {
        return "RaumId: " + raumId + "Zieltemperatur: " + zieltemperatur + "°C" + "Fenster" + fensterliste.size() + "Heizungen: " + heizungliste.size();
    }
}