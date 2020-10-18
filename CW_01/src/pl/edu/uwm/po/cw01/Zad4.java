package pl.edu.uwm.po.cw01;

import java.util.Scanner;

public class Zad4 {

    Scanner k;
    int x,y,min,max;

    public Zad4(){
        this.k = new Scanner(System.in);
    }

    public void print(){

        System.out.println("Najmniejsza liczba to: "+this.min);
        System.out.println("Najwieksza liczba to: "+this.max);    }

    public void foo(int n){
        int temp = Integer.parseInt(this.k.nextLine());
        this.min = temp;
        this.max = temp;
        for(int i = 1; i < n; i++) {
            this.y = Integer.parseInt(this.k.nextLine());
            if (this.y > this.max) {
                this.max = this.y;
            }
            if (this.y < this.min) {
                this.min = this.y;
            }
        }
        print();
    }
}
