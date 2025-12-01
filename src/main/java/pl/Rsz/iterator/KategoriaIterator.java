package pl.Rsz.iterator;

import java.util.Iterator;

class KategoriaIterator implements Iterator<Przedmiot> {
    private Ekwipunek ekwipunek;
    private TypPrzedmiotu szukanyTyp;
    private int index = 0;

    public KategoriaIterator(Ekwipunek ekwipunek, TypPrzedmiotu typ) {
        this.ekwipunek = ekwipunek;
        this.szukanyTyp = typ;
    }

    @Override
    public boolean hasNext() {
        // Sprawdzamy, czy istnieje jakikolwiek następny element pasujący do typu
        int tempIndex = index;
        while (tempIndex < ekwipunek.getPrzedmioty().size()) {
            if (ekwipunek.getPrzedmioty().get(tempIndex).getTyp() == szukanyTyp) {
                return true;
            }
            tempIndex++;
        }
        return false;
    }

    @Override
    public Przedmiot next() {
        // Szukamy następnego pasującego elementu
        while (index < ekwipunek.getPrzedmioty().size()) {
            Przedmiot p = ekwipunek.getPrzedmioty().get(index++);
            if (p.getTyp() == szukanyTyp) {
                return p;
            }
        }
        return null; // Lub rzucenie wyjątku NoSuchElementException
    }
}