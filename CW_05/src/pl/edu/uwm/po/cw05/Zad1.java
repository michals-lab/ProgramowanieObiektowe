package pl.edu.uwm.po.cw05;

import java.util.ArrayList;

public class Zad1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.addAll(a);
        lista.addAll(b);
        return lista;
    }
}
