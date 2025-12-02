package pl.Rsz.prototyp;

class Kwadrat extends Ksztalt {
    public int bok;

    public Kwadrat() {}

    public Kwadrat(Kwadrat target) {
        super(target);
        if (target != null) {
            this.bok = target.bok;
        }
    }

    public Ksztalt clone() {
        return new Kwadrat(this);
    }

    @Override
    public String toString() {
        return "Kwadrat [Kolor=" + kolor + ", Bok=" + bok + ", Punkty=" + punkty + "]";
    }
}