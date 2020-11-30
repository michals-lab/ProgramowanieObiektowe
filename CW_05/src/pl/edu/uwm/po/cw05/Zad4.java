package pl.edu.uwm.po.cw05;

import java.util.ArrayList;

public class Zad4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i=a.size()-1; i>=0; i--){
            lista.add(a.get(i));
        }
        return lista;
    }
}
