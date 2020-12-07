package pl.michaljd.stolarczyk;
import java.time.LocalDate;
import java.util.*;

public class Pracownik extends Osoba {
    private double pobory;
    private LocalDate DataZatrudnienia;

    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        DataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pobory);
    }
}
