package pl.Rsz.lancuchZobowiazan;

class Banknot50Handler extends BanknotHandler {
    public void przetworz(int kwota) {
        if (kwota >= 50) {
            int ilosc = kwota / 50;
            int reszta = kwota % 50;
            System.out.println("Wypłacono " + ilosc + " x 50 PLN");
            if (reszta > 0 && nastepny != null) {
                nastepny.przetworz(reszta);
            } else if (reszta > 0) {
                System.out.println("Nie można wydać reszty: " + reszta);
            }
        } else if (nastepny != null) {
            nastepny.przetworz(kwota);
        }
    }
}