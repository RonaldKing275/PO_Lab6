package pl.Rsz.iterator;

class Przedmiot {
    private String nazwa;
    private TypPrzedmiotu typ;
    private Rzadkosc rzadkosc; // Nowe pole

    // Zaktualizowany konstruktor
    public Przedmiot(String nazwa, TypPrzedmiotu typ, Rzadkosc rzadkosc) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.rzadkosc = rzadkosc;
    }

    public TypPrzedmiotu getTyp() { return typ; }
    public Rzadkosc getRzadkosc() { return rzadkosc; } // Nowy getter

    @Override
    public String toString() {
        return nazwa + " (" + typ + ", " + rzadkosc + ")";
    }
}