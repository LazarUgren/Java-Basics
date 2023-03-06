package DomaciZadatci;

import java.util.Scanner;

public class Dvanesti {
    public static void main(String[] args) {

        /*
        12. Za unete brojeve a, b i c ispisati najmanji od njih
         */

        Scanner sc = new Scanner(System.in);
        int [] niz = new int [3];

        System.out.println("Unesite broj a: ");
        niz[0] = sc.nextInt();
        System.out.println("Unesite broj b: ");
        niz[1] = sc.nextInt();
        System.out.println("Unesite broj c: ");
        niz[2] = sc.nextInt();

        System.out.println("Najmanji broj je broj: ");

        for (int i = 0; i <= niz.length; i++) {
            if (niz[0] < niz[1] && niz[1] < niz[2]) {
                System.out.println(niz[0]);
                break;
            }
            if (niz[1] < niz[0] && niz[1] < niz[2]) {
                System.out.println(niz[1]);
                break;
            }
            if (niz[2] < niz[1] && niz[1] < niz[0]) {
                System.out.println(niz[2]);
                break;
            }
        }


        /*
        a = 5...10...15
        b = 10...5...10
        c = 15...15...5
        a5 < b10; b10 < c15; a5 < c15;
        b5 < a10; a10 < c15; b5 < c15;
        c5 < b10; b10 < a15; c5 < a15;

         */


    }
}
