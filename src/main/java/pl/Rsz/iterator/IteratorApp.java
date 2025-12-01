package pl.Rsz.iterator;

import java.util.Iterator;

public class IteratorApp {
    public static void main(String[] args) {
        Ekwipunek plecak = new Ekwipunek();
        plecak.dodajPrzedmiot(new Przedmiot("Miecz", TypPrzedmiotu.BROŃ));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura Życia", TypPrzedmiotu.MIKSTURA));
        plecak.dodajPrzedmiot(new Przedmiot("Tarcza", TypPrzedmiotu.PANCERZ));
        plecak.dodajPrzedmiot(new Przedmiot("Mikstura Many", TypPrzedmiotu.MIKSTURA));

        System.out.println("--- Cały ekwipunek ---");
        Iterator<Przedmiot> it = plecak.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n--- Tylko Mikstury ---");
        Iterator<Przedmiot> itMikstury = plecak.iteratorKategorii(TypPrzedmiotu.MIKSTURA);
        while(itMikstury.hasNext()) {
            System.out.println(itMikstury.next());
        }
    }
}