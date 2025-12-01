package pl.Rsz.prototyp;

// Klasa pomocnicza (zagnieżdżony obiekt)
class Punkt {
    public int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Punkt też powinien być klonowalny lub tworzony na nowo przy deep copy
    public Punkt(Punkt p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() { return "(" + x + "," + y + ")"; }
}