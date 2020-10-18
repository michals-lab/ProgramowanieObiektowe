package pl.edu.uwm.po.cw02;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        int n;

        while(true){
            n=k.nextInt();
            if((n>=1)&&(n<=100)) break;
        }

        int [] tablica = new int[n];
        System.out.format("Tablica składa się z %d elementów\n", tablica.length);

        for(int i=0; i<tablica.length; i++) {
            tablica[i] = r.nextInt(1998) - 999;
        }

        for(int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
//************************************** A
        int par = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]%2==0){
                par++;
            }
        }
        System.out.println(" ");
        System.out.println("Liczb parzystych jest: "+par);

        int niepar = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]%2!=0){
                niepar++;
            }
        }
        System.out.println("Liczb nieparzystych jest: "+niepar);
//************************************** B
        int dod=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]>0){
                dod++;
            }
        }
        System.out.println("Liczb dodatnich jest: "+dod);

        int uj=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]<0){
                uj++;
            }
        }
        System.out.println("Liczb ujemnych jest: "+uj);

        int zero=0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]==0){
                zero++;
            }
        }
        System.out.println("Zer jest: "+zero);
//************************************* C
        int max = 0;
        int count = 0;
        for(int i=0; i<tablica.length; i++){
            int temp = tablica[i];
            //int max = 0;
            if(tablica[i] > max){
                max = temp;
            }
        }
        System.out.println("Największa to: "+max);

        for(int i=0; i<tablica.length; i++){
            if( tablica[i] == max){
                count++;
            }
        }
        System.out.println("Największa liczba wystąpiła: "+count);
//************************************* D

        int sumdod =0;
        int sumuj = 0;
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]>0){
                sumdod +=tablica[i];
            }
            if(tablica[i]<0){
                sumuj +=tablica[i];
            }
        }
        System.out.println("Suma liczb dodatnich: "+sumdod);
        System.out.println("Suma liczb ujemnych: "+sumuj);
//************************************* E

        int dl=0;
        for(int i=1; i<tablica.length; i++){
            if(i>0) {
                if (tablica[i] > 0) {
                    if ((tablica[i - 1] > 0) && (tablica[i] > 0)) {
                        dl++;
                    }
                }
            }
            else dl++;
        }
        System.out.println("Długość dodatniego fragmentu tablicy wynosi: "+dl);
//************************************** F

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
//************************************* G

        int lewy, prawy;

        while(true){
            lewy=k.nextInt();
            if((lewy>=1)&&(lewy<n)) break;
        }
        while(true){
            prawy=k.nextInt();
            if((prawy>=1)&&(prawy<n)) break;
        }

        lewy -=1;
        prawy -=1;

        System.out.println("Lewy: "+lewy);
        System.out.println("Prawy: "+prawy);

        int [] temp = new int[(prawy-lewy)+1];

        for(int i=prawy; i>=lewy; i-- ){
            temp[prawy-i] = tablica[i];
        }
        for(int i=lewy; i<=prawy; i++){
            tablica[i] = temp[i-lewy];
        }

        for(int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println(" ");
        for(int i=0; i<temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

        System.out.println(" ");


        int [] tablica2 = new int[n];
        Zad2 z2 = new Zad2();
        z2.generuj(tablica2,n,-999,999);
        z2.ileNieparzystych(tablica2);
        z2.ileParzystych(tablica2);
        z2.ileDodatnich(tablica2);
        z2.ileUjemnych(tablica2);
        z2.ileZerowych(tablica2);
        z2.ileMaksymalnych(tablica2);
        z2.sumaDodatnich(tablica2);
        z2.sumaUjemnych(tablica2);
        z2.dlugoscMaksymalnegoCiaguDodatnich(tablica2);
        z2.signum(tablica2);
        z2.odwrocFragment(tablica2,lewy,prawy);

        Zad3 z3 = new Zad3();
        z3.foo();



    }
}
