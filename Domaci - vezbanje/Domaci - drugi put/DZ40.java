package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
40.* Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
 */
public class DZ40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }
        odMinDoMax(niz);
    }
    public static void ispisiNiz(int[] n){
        System.out.print("{");
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i]);
            if (i != n.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    public static int odMinDoMax (int[] niz) {
        int[] minMax = new int[2];
        int[] aB = new int[2];
        int min = niz[0];
        int max = niz[0];
        int a = niz[1];
        int b = niz[1];

            for (int i = 0; i < niz.length; i++){
                if (min > niz[i]){
                    min = niz[i];
                }
            }
            for (int i = 0; i < niz.length; i++){
                if (max < niz[i]){
                    max = niz[i];
                }
            }
            minMax[0] = min;
            minMax[1] = max;

            for (int i = 0; i < niz.length; i++) {
                if (niz[i] != min) {
                    if (a > niz[i]) {
                        a = niz[i];
                    } else {

                    }

                } else {

                }
            }
            for (int i = 0; i < niz.length; i++) {
                if (niz[i] != max) {
                    if (b < niz[i]) {
                        b = niz[i];
                    } else {

                    }
                }
            }
            aB[0] = a;
            aB[1] = b;
            int zbir = aB[0] + aB[1];
        System.out.println(zbir);
        return zbir;
    }




}
