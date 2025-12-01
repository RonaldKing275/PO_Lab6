package pl.Rsz.lancuchZobowiazan;

abstract class BanknotHandler {
    protected BanknotHandler nastepny;

    public void ustawNastepny(BanknotHandler nastepny) {
        this.nastepny = nastepny;
    }

    public void przetworz(int kwota) {
        if (nastepny != null) {
            nastepny.przetworz(kwota);
        } else if (kwota > 0) {
            // Jeśli dotarliśmy do końca łańcucha i kwota nadal > 0, to nominał jest nieprawidłowy
            System.out.println("Nie można wypłacić podanej kwoty. Dostępne nominały to 10, 20, 50.");
        }
    }
}