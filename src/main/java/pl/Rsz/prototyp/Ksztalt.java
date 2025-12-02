package pl.Rsz.prototyp;

import java.util.ArrayList;
import java.util.List;

abstract class Ksztalt {
    public List<Punkt> punkty = new ArrayList<>();
    public String kolor;

    public Ksztalt() {}

    public Ksztalt(Ksztalt target) {
        if (target != null) {

            this.kolor = target.kolor;

            for (Punkt p : target.punkty) {
                this.punkty.add(new Punkt(p));
            }
        }
    }

    public abstract Ksztalt clone();

    public void dodajPunkt(int x, int y) {
        punkty.add(new Punkt(x, y));
    }
}