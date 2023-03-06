package DomaciZadatci.DZ0;
/*
30. -//-. Ispisati svaki treci element u obrnutom redosledu.
Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
 */

import java.util.Scanner;

public class DZ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        ispisiNiz(obrniNiz(niz));



    }

    public static void ispisiNiz (int[] niz){
        System.out.print("{");
        for (int i = 0; i < niz.length; i++){
            System.out.print(niz[i]);
            if (i != niz.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

        public static int[] obrniNiz (int[] niz) {
        int[] noviNiz = new int[(niz.length + 1) / 3];
        for (int i = niz.length - 1, j = 0; i >= 0; i-=3, j++){
            noviNiz[j] = niz[i];
        }
        return noviNiz;
    }




}
