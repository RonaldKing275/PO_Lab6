package pl.Rsz.prototyp;

import java.util.ArrayList;
import java.util.List;

abstract class Ksztalt implements Cloneable {
    public List<Punkt> punkty = new ArrayList<>();
    public String kolor;

    public Ksztalt() {}

    // Konstruktor kopiujący dla wygody
    public Ksztalt(Ksztalt target) {
        if (target != null) {
            this.kolor = target.kolor;
            // GŁĘBOKA KOPIA LISTY:
            for (Punkt p : target.punkty) {
                this.punkty.add(new Punkt(p)); // Tworzymy nowe instancje punktów
            }
        }
    }

    public abstract Ksztalt clone();

    public void dodajPunkt(int x, int y) {
        punkty.add(new Punkt(x, y));
    }
}