package pl.edu.uwm.po.cw04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner napis = new Scanner(System.in);
		String str="LosOsowY Dosc dLugi tEksT";
		String substr="so";
		char znak='h';
		System.out.println(str+znak+"Liczba wystapien: "+Zad1.countChar(str,znak));
		System.out.println("Liczba "+substr+" w "+str+" to: "+Zad1.countSubStr(str,substr));
		System.out.println("Srodkowy znak "+str+" to: "+Zad1.middle(str));
		String rep=napis.next();
		System.out.println("Wypisz 3 razy "+rep+" : "+Zad1.repeat(rep,3));
		for(int zm:Zad1.where(str,substr)){ System.out.print(zm+" "); }
		System.out.println();
		System.out.println("Zmiana wielkosci liter, napisu "+str+" to: "+Zad1.change(str));
		System.out.println(Zad1.nice(str));
		System.out.println(Zad1.nice(str, '>', 2));
		Zad2 z2 = new Zad2("plik.txt",'o');
		Zad3 z3 = new Zad3("plik.txt","dlugi");
		Zad4 z4 = new Zad4(8);
		Zad5 z5 = new Zad5(10000, 3, 5);
    }
}
