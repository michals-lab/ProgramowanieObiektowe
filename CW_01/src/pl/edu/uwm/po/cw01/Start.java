package pl.edu.uwm.po.cw01;
import java.util.Scanner;

public class Start {

    public static void main(String[] args){
        Zad1 z1= new Zad1();
        z1.pktA(pobierz());
        z1.print();
        z1.pktB(pobierz());
        z1.print();
        z1.pktC(pobierz());
        z1.print();
        z1.pktD(pobierz());
        z1.print();
        z1.pktE(pobierz());
        z1.print();
        z1.pktF(pobierz());
        z1.print();
        z1.pktG(pobierz());
        z1.print();
        z1.pktH(pobierz());
        z1.print();

        Zad2 z2= new Zad2();
        z2.suma(pobierz());

        Zad3 z3 = new Zad3();
        z3.ob(pobierz());

        Zad4 z4 = new Zad4();
        z4.foo(pobierz());

        Zad5 z5 = new Zad5();
        z5.foo(pobierz());
    }
    public static int pobierz(){
        Scanner k = new Scanner(System.in);
        return Integer.parseInt(k.nextLine());
    }

}
