public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul=tytul;
        this.autor=autor;
        this.liczbaStron=liczbaStron;
        this.dostepna=dostepna;
    }

    public String getTytul() {
        return this.tytul;
    }

    public boolean isDostepna() {
        return this.dostepna;
    }
    
    //metoda do wypisywania informacji
    public void WypiszInfo()
    {
        System.out.println("Książka: " + tytul + " , Autor: " + autor + ", Liczba stron: " + liczbaStron);
        if (dostepna){
            System.out.println("Książka jest dostępna");
        }else
        {
            System.out.println("Książka niedostępna");
        }
    }

    //metoda do wypozyczania
    public void wypozycz()
    {
        if(dostepna)
        {
            dostepna = false;
            System.out.println("Książka została wypożyczona :)");
        } else
        {
            System.out.println("Książka jest niedostępna :(");
        }
    }

    //metoda do zwracania
    public void zwroc()
    {
        dostepna = true;
        System.out.println("Książka pomyślnie zwrócona");
    }
    
}