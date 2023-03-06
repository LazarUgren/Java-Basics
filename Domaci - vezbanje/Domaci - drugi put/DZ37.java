package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
37. Napisati funkciju koja duplira sve elemente niza.
Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
 */
public class DZ37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }
        ispisiNiz(dupliranjeElementaNiza(niz));
        System.out.println(dupliranjeElementaNiza(niz));
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
    public static int [] dupliranjeElementaNiza (int[] niz){
        for (int i = 0; i < niz.length; i++){
            niz[i] = niz[i] * 2;
        }
        return niz;
    }
}
