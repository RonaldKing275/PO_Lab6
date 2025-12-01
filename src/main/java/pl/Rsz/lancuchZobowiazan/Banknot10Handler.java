package pl.Rsz.lancuchZobowiazan;

class Banknot10Handler extends BanknotHandler {
    public void przetworz(int kwota) {
        if (kwota >= 10) {
            int ilosc = kwota / 10;
            int reszta = kwota % 10;
            System.out.println("Wypłacono " + ilosc + " x 10 PLN");
            if (reszta > 0) {
                System.out.println("Nie można wypłacić reszty: " + reszta + " PLN. Kwota musi być wielokrotnością 10!");
            }
        } else {
            System.out.println("Nie można wypłacić kwoty: " + kwota + " PLN. Kwota musi być większa od 10!");
        }
    }
}