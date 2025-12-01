package pl.Rsz.lancuchZobowiazan;

public class BankomatApp {
    public static void main(String[] args) {
        // Konfiguracja łańcucha
        BanknotHandler h50 = new Banknot50Handler();
        BanknotHandler h20 = new Banknot20Handler();
        BanknotHandler h10 = new Banknot10Handler();

        h50.ustawNastepny(h20);
        h20.ustawNastepny(h10);

        System.out.println("--- Próba wypłaty 130 PLN ---");
        h50.przetworz(130);

        System.out.println("\n--- Próba wypłaty 45 PLN ---");
        h50.przetworz(45);
    }
}