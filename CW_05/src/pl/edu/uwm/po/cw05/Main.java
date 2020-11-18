package pl.edu.uwm.po.cw05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zad1 z1 = new Zad1();
        z1.pktA(pobierz());
        z1.print();

    }

    public static int pobierz() {
        Scanner k = new Scanner(System.in);
        return Integer.parseInt(k.nextLine());
    }
}
