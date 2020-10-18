package pl.edu.uwm.po.cw02;
import java.util.Scanner;

public class Zad2 {

    public static void generuj(int [] tablica,int n,int min,int max) {
        for (int i = 0; i < n; i++) {
            tablica[i] = (int) (Math.random() * (max - (min) + 1)) + min;
        }
    }
//*************************** A
    public static int ileNieparzystych(int tablica[]){
        int niepar = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]%2!=0){
                niepar++;
            }
        }
        return niepar;
    }

    public static int ileParzystych(int tablica[]){
        int par = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]%2==0){
                par++;
            }
        }
        return par;
    }
//*************************** B
    public static int ileDodatnich(int tablica[]){
        int dod=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]>0){
                dod++;
            }
        }
        return dod;
    }

    public static int ileUjemnych(int tablica[]){
        int uj=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]<0){
                uj++;
            }
        }
        return uj;
    }

    public static int ileZerowych(int tablica[]){
        int zero=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]==0){
                zero++;
            }
        }
        return zero;
    }
//*************************** C
    public static int ileMaksymalnych(int tablica[]){
        int max = 0;
        for(int i=0; i<tablica.length; i++){
            int temp = tablica[i];
            //int max = 0;
            if(tablica[i] > max){
                max = temp;
            }
        }
        return max;
    }

//*************************** D

    public static int sumaDodatnich(int tablica[]){
        int sumdod =0;
        for(int i=0; i<tablica.length; i++) {
            if (tablica[i] > 0) {
                sumdod += tablica[i];
            }
        }
        return sumdod;
    }

    public static int sumaUjemnych(int tablica[]){
        int sumuj = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]<0){
                sumuj +=tablica[i];
            }
        }
        return sumuj;
    }

//*************************** E
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tablica[]){
        boolean dod=false;
        int dl=0;
        int temp=0;
        for(int i=0; i<tablica.length; i++){
            if(i>0){
                if(!dod){
                    temp=1;
                    dod=true;
                }
                else{
                    temp++;
                }
            }
            else dod=false;
            if(temp>dl) dl=temp;
        }
        return dl;
    }

//*********************** F
    public static void signum(int tablica[]){
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]>0){
                tablica[i]=1;
            }
            if(tablica[i]<0){
                tablica[i]=-1;
            }
        }
        for(int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

//*********************** G
    public static void odwrocFragment(int tablica[], int lewy, int prawy){
        int temp;
        for(int i=0;i<Math.round((double)(prawy-lewy)/2);i++){
            temp=tablica[lewy+i];
            tablica[lewy+i]=tablica[prawy-i];
            tablica[prawy-i]=temp;
        }
        for(int i=0; i<tablica.length; i++){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}