public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc)
    {
        this.ksiazki=new Ksiazka[pojemnosc];
        this.liczbaKsiazek=0;
    }

    // public void dodajKsiazke(Ksiazka ksiazka)
    // { // logika dodawania do tablicy }
    
}


pole Ksiazka[] ksiazki oraz pole int liczbaKsiazek

· konstruktor przyjmujący maksymalny rozmiar tablicy

· metoda dodajKsiazke(Ksiazka ksiazka)

· metoda wypiszDostepneKsiazki() wykorzystująca pętlę

· metoda znajdzKsiazkePoTytule(String tytul)

· metoda policzDostepneKsiazki() zwracająca liczbę książek dostępnych