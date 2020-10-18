package pl.edu.uwm.po.cw02;
import java.util.Scanner;
import java.util.Random;

public class Zad3 {
    Scanner w = new Scanner(System.in);
    int m,n,k;
    int [][] ma;
    int [][] mb;
    int [][] mc;
    public void foo(){

        this.n=n; this.m=m; this.k=k;
        while(true){
            this.n=w.nextInt();
            if((n>=1)&&(n<=10)) break;
        }
        while(true){
            this.m=w.nextInt();
            if((m>=1)&&(m<=10)) break;
        }
        while(true){
            this.k=w.nextInt();
            if((k>=1)&&(k<=10)) break;
        }
        this.ma = new int[n][m];
        this.mb = new int[k][n];
        this.mc = new int[k][m];
        Random r = new Random();
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                this.ma[i][j] = r.nextInt(9)+1;
            }
        }
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                this.mb[i][j] = r.nextInt(9)+1;
            }
        }
        wypisz(n,m,ma);
        wypisz(k,n,mb);
        wypisz(k,m,mc);

    }
    public void wypisz(int x, int y, int tab[][]){
        System.out.println();
        System.out.println("Macierz "+x+"|"+y);
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
    public void iloczyn(int tab1[][], int tab2[][]){
        int mc[][] = new int[tab1.length][tab2[0].length];
        int c=0;
        for(int i=0; i<mc.length; i++){
            for(int j=0; j<mc[i].length; j++){
                for (int k = 0; k < tab1[0].length; k++) {
                    mc[i][j] += tab1[i][k] * tab2[k][j];
                }
            }
        }

    }

}
