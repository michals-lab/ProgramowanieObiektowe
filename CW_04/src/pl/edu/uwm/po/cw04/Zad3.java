package pl.edu.uwm.po.cw04;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Zad3 {
    public Zad3(String file, String str){
        int count=0;
        try{
            File Plik = new File(file);
            Scanner load = new Scanner(Plik);
            while (load.hasNextLine()){
                String tmp = load.nextLine();
                int len = tmp.length();
                int leng = str.length();
                int index = 0;
                String temp;
                while(len-index>=leng){
                    temp = tmp.substring(index,index+(leng));
                    if(temp.equals(str))count++;
                    index++;
                }
            }
            load.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Niczego tutaj nie znajde");
            ex.printStackTrace();
        }
        System.out.println("W pliku było "+count+" wyrazow "+str);
    }
}
