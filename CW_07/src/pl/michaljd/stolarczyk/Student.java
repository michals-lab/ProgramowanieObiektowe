package pl.michaljd.stolarczyk;

public class Student extends Osoba{

    private String kieruek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko,rokUrodzenia);
        this.kieruek=kierunek;
    }

    public String getKieruek() {
        return this.kieruek;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kieruek='" + kieruek + '\'' +
                '}';
    }
}
