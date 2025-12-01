package pl.Rsz.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Ekwipunek implements Iterable<Przedmiot> {
    private List<Przedmiot> przedmioty = new ArrayList<>();

    public void dodajPrzedmiot(Przedmiot p) {
        przedmioty.add(p);
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    // Standardowy iterator (wszystkie przedmioty)
    @Override
    public Iterator<Przedmiot> iterator() {
        return new EkwipunekIterator(this);
    }

    // Specjalny iterator dla kategorii
    public Iterator<Przedmiot> iteratorKategorii(TypPrzedmiotu szukanyTyp) {
        return new KategoriaIterator(this, szukanyTyp);
    }

    public Iterator<Przedmiot> iteratorRzadkosci(Rzadkosc szukanaRzadkosc) {
        return new RzadkoscIterator(this, szukanaRzadkosc);
    }
}