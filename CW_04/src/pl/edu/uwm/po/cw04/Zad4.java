package pl.edu.uwm.po.cw04;
import java.math.BigInteger;

public class Zad4 {
    public Zad4(int n){
        BigInteger Liczba_z= new BigInteger("0");
        BigInteger mn= new BigInteger("1");
        BigInteger tmp= new BigInteger("2");
        BigInteger max = new BigInteger(String.valueOf(n));
        int temp= n*n;
        for(int i =0; i<=temp; i++){
            if(max.compareTo(mn)==1){
                Liczba_z=Liczba_z.add(mn);
                mn=mn.multiply(tmp);
            }
            else Liczba_z=Liczba_z.add(max);
        }

        System.out.println("uda sie ulozyc "+Liczba_z.toString()+" ziaren");
    }
}
