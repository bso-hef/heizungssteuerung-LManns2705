import java.util.ArrayList;
import java.util.List;

public class Temperaturmanager {

    private List<Raum> raeume = new ArrayList<>();

     public void regeleTemperatur() {
        for (Raum raum : raeume) {
            raum.regeleTemperatur();
        }
     }
     public void erstelleRaueme() {
         Raum raum1 = new Raum(1, 20);
         Heizung heizung1 = new Heizung(raum1);
         Heizung heizung2 = new Heizung(raum1);
         Fenster fenster1 = new Fenster(raum1);
         Fenster fenster2 = new Fenster(raum1);

         Raum raum2 = new Raum(2, 20);
         Heizung heizung3 = new Heizung(raum2);
         Heizung heizung4 = new Heizung(raum2);
         Fenster fenster3 = new Fenster(raum2);
         Fenster fenster4 = new Fenster(raum2);
     }
}