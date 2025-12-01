package pl.Rsz.prototyp;

public class PrototypApp {
    public static void main(String[] args) {
        Kwadrat k1 = new Kwadrat();
        k1.kolor = "Czerwony";
        k1.bok = 10;
        k1.dodajPunkt(0, 0);
        k1.dodajPunkt(10, 10);

        // Klonowanie
        Kwadrat k2 = (Kwadrat) k1.clone();

        System.out.println("Oryginał: " + k1);
        System.out.println("Klon:     " + k2);

        // Test kopii
        System.out.println("\n--- Modyfikacja klona (zmieniam kolor i dodaję punkt) ---");
        k2.kolor = "Niebieski";
        k2.punkty.get(0).x = 999; // Zmiana współrzędnej w klonie

        System.out.println("Oryginał: " + k1 + " (powinien zostać bez zmian)");
        System.out.println("Klon:     " + k2);
    }
}