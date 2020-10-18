package pl.edu.uwm.po.cw01;

import java.util.Scanner;

public class Zad1 {

    Scanner k;
        int x;
        int y;
        public Zad1() {
            this.k = new Scanner(System.in);
        }

    public void print(){
        System.out.println(this.x);
    }

        public void pktA(int n) {
            this.x = 0;

            for(int i = 0; i < n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if (this.y % 2 == 1) {
                    ++this.x;
                }
            }

        }

        public void pktB(int n) {
            this.x = 0;

            for(int i = 0; i < n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if (this.y % 3 == 0 && this.y % 5 != 0) {
                    ++this.x;
                }
            }

        }

        public void pktC(int n) {
            this.x = 0;

            for(int i = 0; i < n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if (Math.sqrt((double)this.y) % 2.0D == 0.0D) {
                    ++this.x;
                }
            }

        }

        public void pktD(int n) {
            this.x = 0;
            int[] z = new int[n];

            int i;
            for(i = 0; i < n; ++i) {
                z[i] = Integer.parseInt(this.k.nextLine());
            }

            for(i = 1; i < n - 1; ++i) {
                if (z[i] < (z[i-1] + z[i+1]) / 2) {
                    ++this.x;
                }
            }

        }

        public void pktE(int n) {
            this.x = 0;
            int z = 1;

            for(int i = 1; i <= n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                z *= i;
                if ((double)this.y > Math.pow(2.0D, (double)i) && this.y < z) {
                    ++this.x;
                }
            }

        }

        public void pktF(int n) {
            this.x = 0;

            for(int i = 1; i <= n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if (i%2 == 1 && this.y%2 == 0) {
                    ++this.x;
                }
            }

        }

        public void pktG(int n) {
            this.x = 0;

            for(int i = 1; i <= n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if (i%2 == 1 && this.y > 0) {
                    ++this.x;
                }
            }

        }

        public void pktH(int n) {
            this.x = 0;

            for(int i = 1; i <= n; ++i) {
                this.y = Integer.parseInt(this.k.nextLine());
                if ((double)Math.abs(this.y) < Math.pow((double)i, 2.0D)) {
                    ++this.x;
                }
            }

        }
}
