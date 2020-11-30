package pl.edu.uwm.po.cw05;

import java.util.ArrayList;

public class Zad5 {
    public static void reverse(ArrayList<Integer> a) {
        ArrayList<Integer> lista = new ArrayList<>(a);
        int tmp = 0;
        for (int i = lista.size() - 1; i >= 0; i--) {
            a.set(tmp, lista.get(i));
            tmp++;
        }
    }
}
