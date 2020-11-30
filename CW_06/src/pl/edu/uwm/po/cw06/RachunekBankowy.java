package pl.edu.uwm.po.cw06;

public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double tmp){
        this.saldo=tmp;
    }
    public void  obliczMiesieczneOdsetki(){
        this.saldo=this.saldo+(this.saldo*rocznaStopaProcentowa)/12;
    }
    public static void setRocznaStopaProcentowa(double tmp){
        rocznaStopaProcentowa=tmp;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
