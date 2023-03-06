package Vid16VezbeNizoviFunkcije;

import java.util.Scanner;

public class Vezbanje1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /*System.out.println("Uneti duzinu niza:");

        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i + 1) + ". element niza");
            niz[i] = sc.nextInt();
        }
        /*
         */

        //ispisiParne(niz);

        //int min = pronadjiMinimum(niz);
        //System.out.println(min);
        int[] niz1 = {1, 2, 3, 4};
        int[] niz2 = {5, 6, 7, 8};
        int[] niz3 = saberiNizove(niz1, niz2);
        ispisiNiz(niz3);
    }


    public static void ispisiParne(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if(niz[i] % 2 == 0) {
                System.out.println(niz[i] + " ");
            }
        }
    }

    public static void ispisatiParneWhile (int[] niz) {
        int i = 0;
        
        while (i < niz.length){
            if(niz[i] % 2 == 0) {
                System.out.println(niz[i] + " ");
            }

            i++;
        }
    }

    /*
    ulaz niz1 {1, 2, 3, 4}
    ulaz niz2 {5, 6, 7, 8}
    izlaz niz3 {6, 8, 10, 12}
     */

    public static int[] saberiNizove (int[] niz1, int[] niz2){
        int[] niz3 = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++){
            niz3[i] = niz1[i] + niz2[i];
        }
        return niz3;
    }

    public static int pronadjiMinimum (int[] niz) {
        int min = niz[0];
        for (int i = 1; i < niz.length; i++){
            if (niz[i] < min){
                min = niz[i];
            }
        }
        return min;
    }

    public static void ispisiNiz(int[] n) {
        // {1, 2, 3, 4} hocu da ga ispisem u ovom formatu
        System.out.print("{");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != n.length - 1) {    // n.lenght - 1 je index poslednjeg elementa
                System.out.print(", ");  // ako i pokazuje na nesto sto nije poslednji element
            }// i < n.length - 1              // onda ispisujem zarez
            //Ovo je drugi nacina na koji moze da se uradi.
        }
        System.out.println("}");
    }
}

