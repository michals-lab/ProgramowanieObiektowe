package pl.michaljd.stolarczyk;

public class Nauczyciel extends Osoba {

    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "pensja=" + pensja +
                '}';
    }
}
