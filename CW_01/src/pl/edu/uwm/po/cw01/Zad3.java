package pl.edu.uwm.po.cw01;

import java.util.Scanner;

public class Zad3 {

    Scanner k;
    int x,y,dod,uj,zero;

    public Zad3(){
        this.k = new Scanner(System.in);
    }

    public void print(){

        System.out.println("Zer jest: "+(this.zero));
        System.out.println("Liczb ujemnych jest: "+this.uj);
        System.out.println("Liczb dodatnich jest: "+this.dod);
    }

    public void ob(int n){
        this.x = 0;
        for(int i = 0; i < n; i++) {
            this.y = Integer.parseInt(this.k.nextLine());
            if (this.y > 0) {
                this.x+= this.y;
                this.dod++;
            }
            if(this.y<0){
                this.uj++;
            }
            if(this.y==0){
                this.zero++;
            }
        }
        print();
    }
}
