package pl.edu.uwm.po.cw01;

import java.util.Scanner;

public class Zad2 {

    Scanner k;
    int x;
    int y;
    public Zad2(){
        this.k = new Scanner(System.in);
    }

    public void print(){

        System.out.println(this.x);
    }

    public void suma(int n){
        this.x = 0;
        for(int i = 0; i < n; i++) {
            this.y = Integer.parseInt(this.k.nextLine());
            if (this.y > 0) {
                this.x+= this.y;
            }
        }
        this.x*=2;
        print();
    }
}
