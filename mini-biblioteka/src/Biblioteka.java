public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc)
    {
        this.ksiazki=new Ksiazka[pojemnosc];
        this.liczbaKsiazek=0;
    }

    public void dodajKsiazke(Ksiazka ksiazka)
    {
        if(liczbaKsiazek < ksiazki.length)
        {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else
        {
            System.out.println("Biblioteka jest pełnia, nie można dodać!!!");
        }
    }

    public void wypiszDostepneKsiazki()
    {
        System.out.println("Dostępne ksiązki: ");
        for (int i = 0; i < liczbaKsiazek ; i++)
        {
            if(ksiazki[i].dostepna)
            {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    
}


pole Ksiazka[] ksiazki oraz pole int liczbaKsiazek

· konstruktor przyjmujący maksymalny rozmiar tablicy

· metoda dodajKsiazke(Ksiazka ksiazka)

· metoda wypiszDostepneKsiazki() wykorzystująca pętlę

· metoda znajdzKsiazkePoTytule(String tytul)

· metoda policzDostepneKsiazki() zwracająca liczbę książek dostępnych