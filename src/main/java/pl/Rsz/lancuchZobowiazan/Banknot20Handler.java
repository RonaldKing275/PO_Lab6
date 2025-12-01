package pl.Rsz.lancuchZobowiazan;

class Banknot20Handler extends BanknotHandler {
    public void przetworz(int kwota) {
        if (kwota >= 20) {
            int ilosc = kwota / 20;
            int reszta = kwota % 20;
            System.out.println("Wypłacono " + ilosc + " x 20 PLN");
            if (reszta > 0 && nastepny != null) {
                nastepny.przetworz(reszta);
            } else if (reszta > 0) {
                // Przekaż dalej, może 10 PLN obsłuży resztę (np. przy kwocie 30: 20+10)
                if(nastepny != null) nastepny.przetworz(reszta);
            }
        } else if (nastepny != null) {
            nastepny.przetworz(kwota);
        }
    }
}