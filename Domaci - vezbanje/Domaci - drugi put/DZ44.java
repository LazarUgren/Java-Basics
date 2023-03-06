package DomaciZadatci.DZ0;

import java.util.Arrays;
import java.util.Scanner;

/*
44.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
Npr:
[1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
[1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8]
 */
public class DZ44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        sabiranjeClanovaNiza(niz);

    }

    public static void sabiranjeClanovaNiza (int[] niz){

            if (niz.length % 2 != 0){
                int[] polaNiza1 = new int[(niz.length / 2) + 1];
                int[] polaNiza2 = new int[(niz.length / 2) + 1];
                int[] sabraniNiz = new int[(niz.length / 2) + 1];

                for (int i = 0; i < polaNiza1.length; i++) {
                    polaNiza1[i] = niz[i];
                }
                for (int i = 0, j = (niz.length / 2); i < polaNiza2.length; i++, j++) {
                    polaNiza2[i] = niz[j];
                }
                for (int i = 0; i < sabraniNiz.length; i++) {
                    sabraniNiz[i] = polaNiza1[i] + polaNiza2[i];
                    System.out.println(sabraniNiz[i]);
                }
            } else {

                int[] polaNiza1 = new int[niz.length / 2];
                int[] polaNiza2 = new int[niz.length / 2];
                int[] sabraniNiz = new int[niz.length / 2];


                for (int i = 0; i < polaNiza1.length; i++) {
                    polaNiza1[i] = niz[i];
                }
                for (int i = 0, j = (niz.length / 2); i < polaNiza2.length; i++, j++) {
                    polaNiza2[i] = niz[j];
                }
                for (int i = 0; i < sabraniNiz.length; i++) {
                    sabraniNiz[i] = polaNiza1[i] + polaNiza2[i];
                    System.out.println(sabraniNiz[i]);
                }
            }




    }

}
