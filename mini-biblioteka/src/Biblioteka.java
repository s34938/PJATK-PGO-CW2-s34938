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
            if(ksiazki[i].isDostepna())
            {
                ksiazki[i].WypiszInfo();
            }
        }
    }

    public void znajdzKsiazkePoTytule(String tytul)
    {
        for (int i = 0; i < liczbaKsiazek; i++)
        {
            if(ksiazki[i].getTytul().equals(tytul))
            {
                System.out.println("Znaleziono ksiązkę: " + tytul);
                ksiazki[i].WypiszInfo();
                break;
            } else
            {
                System.out.println("Nie znaleziono książki: " + tytul);
            }
        }
    }

    public void policzDostepneKsiazki()
    {
        int licznik = 0;
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if (ksiazki[i].isDostepna())
            {
                licznik++;
            }
        }
        System.out.println("Liczba dostępnych książek wynosi:" + licznik);
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik)
    {
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if(ksiazki[i].getTytul().equals(tytul))
            {
               if(ksiazki[i].isDostepna())
               {
                   ksiazki[i].wypozycz();
                   czytelnik.wypozyczonaKsiazka = ksiazki[i];
                   System.out.println("Wypozyczono książkę: " + tytul + " czytelnikowi: "
                   + czytelnik.imie + " " + czytelnik.nazwisko);
               } else
               {
                   System.out.println("Książka: " + tytul + " niestety została już wypożyczona przez kogoś innego");
               }
               return;
            }
        }
        System.out.println("Nie znaleziono ksiązki: " + tytul);
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik)
    {
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if(ksiazki[i].getTytul().equals(tytul))
            {
                ksiazki[i].zwroc();
                czytelnik.wypozyczonaKsiazka = null;
                System.out.println("Zwrócono książkę: " + tytul);
            }
        }
    }
}
