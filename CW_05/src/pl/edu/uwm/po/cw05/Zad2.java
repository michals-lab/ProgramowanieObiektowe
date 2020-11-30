package pl.edu.uwm.po.cw05;

import java.util.ArrayList;

public class Zad2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        int lena = a.size();
        int lenb = b.size();
        ArrayList<Integer> lista = new ArrayList<>();
        int tmp=0;
        for(int i=0; i<Math.min(lena,lenb); i++){
            lista.add(a.get(tmp));
            lista.add(b.get(tmp));
            tmp++;
        }
        if(lena<lenb){
            for(int i=0; i<Math.abs(lena-lenb); i++){
                lista.add(b.get(tmp+i));
            }
        }
            else{
                for(int i=0; i<Math.abs(lena-lenb); i++){
                    lista.add(a.get(tmp+i));
            }
        }
        return lista;
    }
}
