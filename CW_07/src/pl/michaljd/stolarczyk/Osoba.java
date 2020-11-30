package pl.michaljd.stolarczyk;

public class Osoba {

    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
