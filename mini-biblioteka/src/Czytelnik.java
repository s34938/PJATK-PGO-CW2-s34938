public class Czytelnik {
    String imie;
    String nazwisko;
    int numerKarty;
    int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numerKarty=numerKarty;
        this.liczbaWypozyczen=liczbaWypozyczen;
    }
}


/*pola: imie, nazwisko, numerKarty, liczbaWypozyczen

· konstruktor ustawiający dane czytelnika

· metody: wypiszDane(), zwiekszLiczbeWypozyczen(), zmniejszLiczbeWypozyczen()

· w Main utwórz co najmniej dwóch czytelników i wywołaj ich metody*/