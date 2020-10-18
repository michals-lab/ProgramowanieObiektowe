package pl.edu.uwm.po.cw01;

import java.util.Scanner;

public class Zad5 {

    Scanner k;
    int x,y;

    public Zad5(){
        this.k = new Scanner(System.in);
    }

    public void print(){

        System.out.println("Liczba par: "+this.x);
    }

    public void foo(int n){
        double [] temp=new double[n];
        this.x=0;
        for(int i=0;i<n;i++){
            temp[i]=Double.parseDouble(k.nextLine());
            if(i>0){
                if((temp[i-1]>0)&&(temp[i]>0)){
                    this.x++;
                }
            }
        }
        print();
    }
}
