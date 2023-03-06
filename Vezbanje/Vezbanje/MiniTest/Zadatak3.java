package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Preko skenera uneti duzinu niza.
        Zatim uneti sve elemente niza preko scennera.
        a) Ispisati redom sve elemente niza
        b) Ispisati od poslednjeg do prvog sve elemete niza.
        c) Ispisati svaki 3 element niza.
         */

        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            niz[i] = sc.nextInt();
        }
            // a)
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }
        System.out.println("_______");
            //b)
        for (int i = niz.length - 1; i >= 0; i--){
            System.out.println(niz[i]);
        }
        System.out.println("_______");

        // c)
        for (int i = 0; i < niz.length; i+=3){ // inkrement je na svaki treci
            System.out.println(niz[i]);
        }
        System.out.println("_______");

        // d) ispisati sumu svih elemenata niza
        int suma = 0;
        for (int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
        System.out.println("suma je: ");
        System.out.println(suma);
        System.out.println("_______");

        // e) naci max niza

        int max = niz[0];
        for (int i = 0; i < niz.length; i++){
            if (niz[i] > max){
                max = niz[i];
            }

        }
        System.out.println("Max je: ");
        System.out.println(max);

        System.out.println("_________");

        // f) naci minimum niza

        int min = niz[0];
        for (int i = 0; i < niz.length; i++){
            if (niz[i] < min){
                min = niz[i];
            }
        }
        System.out.println("Minimum je: ");
        System.out.println(min);


    }
}
