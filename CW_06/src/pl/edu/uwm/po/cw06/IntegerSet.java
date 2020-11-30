package pl.edu.uwm.po.cw06;

public class IntegerSet {
    private boolean[] tab;
    public IntegerSet(){
        this.tab=new boolean[100];
    }
    public static IntegerSet union(IntegerSet x, IntegerSet y){
        IntegerSet su=new IntegerSet();
        for(int i=0; i<100; i++){
            if(x.tab[i] || y.tab[i])su.tab[i]=true;
        }
        return su;
    }
    public static IntegerSet intersection(IntegerSet x, IntegerSet y){
        IntegerSet ilo=new IntegerSet();
        for(int i=0; i<100; i++){
            if(x.tab[i] && y.tab[i])ilo.tab[i]=true;
        }
        return ilo;
    }
    public void insertElement(int i){
        this.tab[i-1]=true;
    }
    public void deleteElement(int i){
        this.tab[i-1]=false;
    }
    public String toString(){
        StringBuilder tmp=new StringBuilder();
        for(int i=0; i<100; i++){
            if(this.tab[i]){
                tmp.append(i+1);
                tmp.append(" ");
            }
        }
        return tmp.toString();
    }
    public boolean equals(IntegerSet x){
        return this.toString().equals(x.toString());
    }

}
