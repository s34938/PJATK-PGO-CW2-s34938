public class Main
{
    public static void main(String[] args)
    {
        Biblioteka biblioteka = new Biblioteka(10);
        Ksiazka k1 = new Ksiazka("Potop", "Sienkiewicz", 800, true);
        Ksiazka k2 = new Ksiazka("Mały Książe", "de Saint-Exupéry", 90, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien", 300, true);

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println("=======Wypisanie=======");
        Czytelnik c1 = new Czytelnik("Halina", "Nowak", 1,0);
        biblioteka.wypiszDostepneKsiazki();
        c1.wypiszDane();

        System.out.println("=======Wypożyczanie=======");
        biblioteka.wypozyczKsiazke("Hobbit", c1);
        biblioteka.wypiszDostepneKsiazki();
        biblioteka.policzDostepneKsiazki();

        System.out.println("=======Zwracanie=======");
        biblioteka.zwrocKsiazke("Hobbit", c1);

        System.out.println("=======Sprawdzenie=======");
        c1.wypiszDane();
        biblioteka.policzDostepneKsiazki();
    }
}