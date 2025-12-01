package pl.Rsz.iterator;

import java.util.Iterator;

class EkwipunekIterator implements Iterator<Przedmiot> {
    private Ekwipunek ekwipunek;
    private int index = 0;

    public EkwipunekIterator(Ekwipunek ekwipunek) {
        this.ekwipunek = ekwipunek;
    }

    @Override
    public boolean hasNext() {
        return index < ekwipunek.getPrzedmioty().size();
    }

    @Override
    public Przedmiot next() {
        return ekwipunek.getPrzedmioty().get(index++);
    }
}