package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
Primer: [1, 2, 3, 4, 5] -> 1 3 5
b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
 */
public class DZ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza");
            niz[i] = sc.nextInt();
        }

        ispisiNiz(svakiDrugiClanNiza(niz));


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

    public static int[] svakiDrugiClanNiza (int[] niz){
        int[] niz2 = new int [(niz.length + 1) / 2];
        for (int i = 0, j = 0; i < niz.length; i+=2, j++){
            niz2[j] = niz[i];
        }
        return niz2;
    }

}
