package pl.edu.uwm.po.cw05;

import java.util.ArrayList;

public class Zad3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        int lena = a.size();
        int lenb = b.size();
        ArrayList<Integer> lista = new ArrayList<>();
        int zma = 0;
        int zmb = 0;
        for (int i = 0; i < lena + lenb; i++) {
            if (zma < lena && zmb < lenb) {
                if (a.get(zma) < b.get(zmb)) {
                    lista.add(a.get(zma));
                    zma++;
                } else {
                    lista.add(b.get(zmb));
                    zmb++;
                }
            } else if (zma < lena) {
                lista.add(a.get(zma));
                zma++;
            } else {
                lista.add(b.get(zmb));
                zmb++;
            }
        }
        return lista;
    }
}
