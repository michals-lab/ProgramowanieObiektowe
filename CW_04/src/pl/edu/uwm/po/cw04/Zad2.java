package pl.edu.uwm.po.cw04;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Zad2 {
    public Zad2(String file, char zn){
        int count=0;
        try{
            File Plik = new File(file);
            Scanner load = new Scanner(Plik);
            while (load.hasNextLine()){
                String tmp = load.nextLine();
                count += (int) tmp.chars().filter(ch->ch==zn).count();
            }
            load.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Niczego tutaj nie znajde");
            ex.printStackTrace();
        }
        System.out.println("W pliku było "+count+" znakow "+zn);
    }
}
