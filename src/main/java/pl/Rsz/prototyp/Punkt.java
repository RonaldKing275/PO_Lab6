package pl.Rsz.prototyp;

class Punkt {
    public int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() { return "(" + x + "," + y + ")"; }
}