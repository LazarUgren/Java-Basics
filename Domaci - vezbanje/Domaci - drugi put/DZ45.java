package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
45.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
b)** -//- bez kreiranja dodatnih nizova
 */
public class DZ45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu prvog niza: ");
        int duzinaNiza = sc.nextInt();
        System.out.println("Unesite duzinu drugog niza: ");
        int duzinaNiza2 = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        int[] niz2 = new int[duzinaNiza2];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan prvog niza: ");
            niz[i] = sc.nextInt();
        }
        for (int i = 0; i < niz2.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan drugog niza: ");
            niz2[i] = sc.nextInt();
        }
        System.out.println("Moj nacin, laksi.");
        sabiranje(niz, niz2);
        System.out.println(">>>>>>>>>>>>><<<<<<<<<<<<<<<");
        System.out.println("Tezi nacin, bez kreiranja novih nizova.");
        tezaVerzija(niz, niz2);

    }

    public static void sabiranje (int[] niz1, int[] niz2){

        if (niz1.length > niz2.length){
            int[] niz3 = new int[niz1.length];
            int[] niz2N = new int[niz1.length];
            for (int i = 0; i < niz2.length; i++){
                niz2N[i] = niz2[i];
            }
            for (int i = 0; i < niz3.length; i++){
                niz3[i] = niz1[i] + niz2N[i];
                System.out.println(niz3[i]);
            }

        } else {
            int[] niz3 = new int[niz2.length];
            int[] niz1N = new int[niz2.length];
            for (int i = 0; i < niz1.length; i++){
                niz1N[i] = niz1[i];
            }
            for (int i = 0; i < niz3.length; i++){
                niz3[i] = niz2[i] + niz1N[i];
                System.out.println(niz3[i]);
            }

        }
    }

    public static void tezaVerzija (int[] niz1, int[] niz2) {
        if (niz1.length > niz2.length){
            for (int i = 0; i < niz2.length; i++){
                niz1[i] = niz1[i] + niz2[i];
            }
            for (int i = 0; i < niz1.length; i++){
                System.out.println(niz1[i]);
            }

        } else {
            for (int i = 0; i < niz1.length; i++){
                niz2[i] = niz2[i] + niz1[i];
            }
            for (int i = 0; i < niz2.length; i++){
                System.out.println(niz2[i]);
            }
        }

    }




}
