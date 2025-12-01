package pl.Rsz.iterator;

class Przedmiot {
    private String nazwa;
    private TypPrzedmiotu typ;

    public Przedmiot(String nazwa, TypPrzedmiotu typ) {
        this.nazwa = nazwa;
        this.typ = typ;
    }

    public TypPrzedmiotu getTyp() { return typ; }
    public String toString() { return nazwa + " (" + typ + ")"; }
}