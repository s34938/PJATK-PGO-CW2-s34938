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

    public void znajdzKsiazkePoTytule(String tytul)
    {
        for (int i = 0; i < liczbaKsiazek; i++)
        {
            if(ksiazki[i].tytul.equals(tytul))
            {
                System.out.println("Znaleziono ksiązkę: " + tytul);
                ksiazki[i].wypiszInfo();
                break;
            } else
            {
                System.out.println("Nie znaleziono książki: " + tytuł);
            }
        }
    }

    public int policzDostepneKsiazki()
    {
        int licznik = 0;
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if (ksiazki[i].dostepna)
            {
                licznik++;
            }
        }
        System.out.println("Liczba dostępnych książek wynosi: " + licznik);
    }

    public void wypozyczKsiazke
    {
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if(ksiazki[i].tytul.equals(tytul))
            {
               if(ksiazki[i].dostepna)
               {
                   ksiazki[i].wypozycz;
                   czytelnik.wypozyczonaKsiazka = ksiazki[i];
                   System.out.println("Wypozyczono książkę: " + tytuł + " czytelnikowi: "
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

    public void zwrocKsiazke
    {
        for (int i = 0 ; i < liczbaKsiazek ; i++)
        {
            if(ksiazki[i].tytul.equals(tytul))
            {
                ksiazki[i].zwroc;
                czytelnik.wypozyczonaKsiazka = null;
                System.out.println("Zwrócono książkę: " + tytuł);
            }
        }
    }
}
