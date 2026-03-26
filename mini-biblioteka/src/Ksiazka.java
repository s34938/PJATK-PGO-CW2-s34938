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
    
    //metoda do wypisywania informacji
    public void WypiszInfo()
    {
        System.out.println("Książka: " + tytul ", Autor: " + autor + ", Liczba stron: " + liczbaStron);
        if (dostepna){
            System.out.println("Książka jest dostępna");
        }else
        {
            System.out.println("Książka niedostępna");
        }
    }
    
}