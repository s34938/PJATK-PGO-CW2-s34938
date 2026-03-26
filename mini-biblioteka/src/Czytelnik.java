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

    //wypisywanie danych
    public void wypiszDane()
    {
        System.out.println("Imie: " + imie + " ,Nazwisko: " + nazwisko + " ,Numer Karty: " +
                numerKarty + " ,Liczba Wypożyczań: " + liczbaWypozyczen);
    }

    //zwiekszenie l. wypozyczen
    public int zwiekszLiczbeWypozyczen()
    {
        liczbaWypozyczen += liczbaWypozyczen;
        System.out.println("Wypożyczono książkę :). Liczba wypożyczeń wynosi teraz: " + liczbaWypozyczen);
    }

    //zmniejszenie l. wypozyczen
    public int zmniejszLiczbeWypozyczen()
    {
        liczbaWypozyczen -= liczbaWypozyczen;
        System.out.println("Oddano książkę :). Liczba wypożyczeń wynosi teraz: " + liczbaWypozyczen);
    }
    
}
