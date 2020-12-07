package pl.michaljd.stolarczyk;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//*********** D
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Kowalski", LocalDate.of(1232,7,14)));
        grupa.add(new Osoba("Nowak", LocalDate.of(1111,12,3)));
        grupa.add(new Osoba("Małysz", LocalDate.of(1232,1,5)));
        grupa.add(new Osoba("Najman", LocalDate.of(1232,9,23)));
        grupa.add(new Osoba("Ja", LocalDate.of(1232,8,9)));
        for(int i=0; i<5; i++){
            System.out.println(grupa.get(i));
        }
        System.out.println("Nieposortowana grupa: "+grupa);
        Collections.sort(grupa);
        System.out.println("Posortowana grupa: "+grupa);
        System.out.println();

    //********* TestStudent
        System.out.println("TestStudent");
        ArrayList<Osoba> Studenci = new ArrayList<>(5);
        Studenci.add(new Student("Kowalski", LocalDate.of(1232,7,14), 3.3));
        Studenci.add(new Student("Nowak", LocalDate.of(1234,7,14), 4.5));
        Studenci.add(new Student("Małysz", LocalDate.of(999,7,14), 5.0));
        Studenci.add(new Student("Najman", LocalDate.of(2034,7,14), 2.5));
        Studenci.add(new Student("Ja", LocalDate.of(1909,7,14), 4.0));
        for(int i=0; i<5; i++){
            System.out.println(Studenci.get(i));
        }
        System.out.println("Nieposortowana grupa: "+Studenci);
        Collections.sort(Studenci);
        System.out.println("Posortowana grupa: "+Studenci);
        System.out.println();
    //*********** Zad3
        System.out.println("Zad 3");
        if (args.length != 0) {
            ArrayList<String> Zad3 = new ArrayList<>();
            try {
                File file = new File(args[0]);
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    Zad3.add(scan.nextLine());
                }
                scan.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(Zad3);
            Collections.sort(Zad3);
            System.out.println(Zad3);
        }
    }
}
