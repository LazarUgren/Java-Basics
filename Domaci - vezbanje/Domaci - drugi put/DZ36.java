package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
36.* Napisati funkciju koja vraca najmanji element niza.
 */
public class DZ36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        najmanjiElementNiza(niz);
    }

    public static void najmanjiElementNiza (int[] niz) {
        int min = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (min > niz[i]){
                min = niz[i];
            }
        }
        System.out.println(min);
    }

}
