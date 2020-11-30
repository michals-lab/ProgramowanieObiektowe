package pl.michaljd.stolarczyk;

public class Main {

    public static void main(String[] args) {
        Adres a1 = new Adres("Długa", "20", "Watykan", "12-345");
        Adres a2 = new Adres("Długa", "20", "Watykan", "12-348");
        a1.pokaz();
        a2.pokaz();
        System.out.println(a1.przed(a2));

        Osoba Jan = new Osoba("Kowalski", 1990);
        Student Grzegorz = new Student("Brzęczyszczykiewicz",1234,"Astrologia stosowana");
        Nauczyciel Adam = new Nauczyciel("Małysz", 1977, 12345);
        System.out.println(Jan);
        System.out.println(Grzegorz);
        System.out.println(Adam);
        System.out.println(Grzegorz.getKieruek());
        System.out.println(Grzegorz.getNazwisko());
        System.out.println(Grzegorz.getRokUrodzenia());
        System.out.println(Adam.getPensja());

        BetterRectangle kwadrat = new BetterRectangle(2,2,2,2);
        System.out.println((kwadrat.getArea()));
        System.out.println((kwadrat.getPerimeter()));
    }
}
