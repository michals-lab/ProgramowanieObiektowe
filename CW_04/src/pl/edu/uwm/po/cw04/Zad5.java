package pl.edu.uwm.po.cw04;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad5 {
    public Zad5(int k, int p, int n){
        BigDecimal K=new BigDecimal(String.valueOf(k));
        BigDecimal P=new BigDecimal(String.valueOf(p));
        BigDecimal N=new BigDecimal(String.valueOf(n));
        BigDecimal count=new BigDecimal(String.valueOf(k));
        count=count.add(K.multiply(N.multiply(P.divide(new BigDecimal("100")))));
        count=count.setScale(2,RoundingMode.HALF_UP);
        System.out.println("Kapital "+K.toString()+" to "+count.toString());
    }
}
