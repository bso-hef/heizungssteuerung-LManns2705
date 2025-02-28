public class Raum {

    private int raumId;
    private int zieltemperatur;

    public Raum (int raumId, int zieltemperatur) {
        this.raumId = raumId;
        this.zieltemperatur = zieltemperatur;
    }

    public int getZieltemperatur() {
        return zieltemperatur;
    }

    public void setZieltemperatur() {
        this.zieltemperatur = zieltemperatur;
    }

    public boolean hatOffeneFenster() {
    }

    public void regeleTemperatur() {
    }

    public String toString() {
        return "Raum" + raumId + ": " + zieltemperatur + "°C. Fenster: ";
    }
}
