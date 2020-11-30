package pl.edu.uwm.po.cw05;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> listaa= new ArrayList<>(Arrays.asList(1,4,9,16));
        ArrayList<Integer> listab= new ArrayList<>(Arrays.asList(9,7,4,11));
        System.out.println(listaa);
        System.out.println(listab);
        System.out.println("Zadanie 1: "+Zad1.append(listaa,listab));
        System.out.println("Zadanie 2: "+Zad2.merge(listaa,listab));
        System.out.println("Zadanie 3: "+Zad3.mergeSorted(listaa,listab));
        System.out.println("Zadanie 4: "+Zad4.reversed(listab));
        Zad5.reverse(listaa);
        System.out.println("Zadanie 5:"+listaa);


    }
}
