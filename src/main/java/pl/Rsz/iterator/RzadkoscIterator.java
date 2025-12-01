package pl.Rsz.iterator;

import java.util.Iterator;

public class RzadkoscIterator implements Iterator<Przedmiot> {
    private Ekwipunek ekwipunek;
    private Rzadkosc szukanaRzadkosc;
    private int index = 0;

    public RzadkoscIterator(Ekwipunek ekwipunek, Rzadkosc rzadkosc) {
        this.ekwipunek = ekwipunek;
        this.szukanaRzadkosc = rzadkosc;
    }

    @Override
    public boolean hasNext() {
        int tempIndex = index;
        while (tempIndex < ekwipunek.getPrzedmioty().size()) {
            if (ekwipunek.getPrzedmioty().get(tempIndex).getRzadkosc() == szukanaRzadkosc) {
                return true;
            }
            tempIndex++;
        }
        return false;
    }

    @Override
    public Przedmiot next() {
        while (index < ekwipunek.getPrzedmioty().size()) {
            Przedmiot p = ekwipunek.getPrzedmioty().get(index++);
            if (p.getRzadkosc() == szukanaRzadkosc) {
                return p;
            }
        }
        return null;
    }
}