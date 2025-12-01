package pl.Rsz.iterator;

import java.util.Iterator;

public class IteratorApp {
    public static void main(String[] args) {

        Ekwipunek plecak = new Ekwipunek();

        plecak.dodajPrzedmiot(new Przedmiot("Piekielny Miecz", TypPrzedmiotu.BRON_DWURECZNA, Rzadkosc.LEGENDARY));
        plecak.dodajPrzedmiot(new Przedmiot("Miecz krótki", TypPrzedmiotu.BRON_JEDNORECZNA, Rzadkosc.COMMON));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura HP 20", TypPrzedmiotu.MIKSTURA, Rzadkosc.COMMON));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura HP 150", TypPrzedmiotu.MIKSTURA, Rzadkosc.EPIC));
        plecak.dodajPrzedmiot(new Przedmiot("Hełm Mrocznego Grzybiarza", TypPrzedmiotu.HELM, Rzadkosc.RARE));
        plecak.dodajPrzedmiot(new Przedmiot("Napierśnik Króla Demonów", TypPrzedmiotu.NAPIERSNIK, Rzadkosc.MYTHIC));
        plecak.dodajPrzedmiot(new Przedmiot("Spodnie Wielkanocne 2024", TypPrzedmiotu.SPODNIE, Rzadkosc.SET));
        plecak.dodajPrzedmiot(new Przedmiot("Buty Wojowników Pustyni", TypPrzedmiotu.BUTY, Rzadkosc.UNCOMMON));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura HP 400", TypPrzedmiotu.MIKSTURA, Rzadkosc.LEGENDARY));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura MP 50", TypPrzedmiotu.MIKSTURA, Rzadkosc.UNCOMMON));

        System.out.println("--- Cały ekwipunek ---");
        Iterator<Przedmiot> it = plecak.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n--- Tylko Kategoria Mikstury ---");
        Iterator<Przedmiot> itMikstury = plecak.iteratorKategorii(TypPrzedmiotu.MIKSTURA);
        while(itMikstury.hasNext()) {
            System.out.println(itMikstury.next());
        }

        System.out.println("\n--- Tylko Rzadkość Legendarna ---");
        Iterator<Przedmiot> itLegendary = plecak.iteratorRzadkosci(Rzadkosc.LEGENDARY);
        while(itLegendary.hasNext()) {
            System.out.println(itLegendary.next());
        }
    }
}