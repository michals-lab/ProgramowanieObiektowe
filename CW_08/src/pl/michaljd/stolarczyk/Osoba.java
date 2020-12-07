package pl.michaljd.stolarczyk;
import java.time.LocalDate;
import java.util.*;

public abstract class Osoba {
    private String nazwisko;
    private String[] imiona;
    private LocalDate DataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec) {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        DataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return DataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

}
