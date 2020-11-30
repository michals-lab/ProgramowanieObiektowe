package pl.edu.uwm.po.cw06;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //*******************Zad1
        RachunekBankowy saver1 = new RachunekBankowy((2000.00));
        RachunekBankowy saver2 = new RachunekBankowy((3000.00));
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(("Stan oszczednosci dla odsetek 4% = "+saver1.getSaldo()));
        System.out.println(("Stan oszczednosci dla odsetek 4% = "+saver2.getSaldo()));
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(("Stan oszczednosci dla odsetek 5% = "+saver1.getSaldo()));
        System.out.println(("Stan oszczednosci dla odsetek 5% = "+saver2.getSaldo()));
        //******************Zad2
        IntegerSet a= new IntegerSet();
        IntegerSet b= new IntegerSet();
        a.insertElement(21);
        a.insertElement(4);
        a.insertElement(45);
        System.out.println("Zbiór a: "+a);
        a.deleteElement(45);
        System.out.println("Zbiór a, po usunięciu elementu: "+a);
        b.insertElement(34);
        b.insertElement(22);
        System.out.println("Zbiór b: "+b);
        System.out.println("Suma a i b: "+IntegerSet.union(a,b));
        System.out.println("Iloczyn a i b: "+IntegerSet.intersection(a,b));
        System.out.println("Czy a jest rowne b "+a.equals(b));
        //******************Zad3
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new Pracownik("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new Pracownik("Antoni Tester", 40000, 2005, 3, 15);

        // zwiększ pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();


    }
}
