package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
39.* Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
 */
public class DZ39 {
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
        ispisiNiz(niz);
        ispisiNiz(niz2);

        ispisiNiz(nadovezivanjeNiza(niz, niz2));

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

    public static int[] nadovezivanjeNiza (int[] niz1, int[] niz2){
        int[] niz3 = new int[niz1.length + niz2.length];
        for (int i = 0, j = 0; i < niz1.length; i++, j++){
            niz3[j] = niz1[i];
        }
        for (int i = 0, j = niz1.length; i < niz2.length; i++, j++){
            niz3[j] = niz2[i];
        }
        return niz3;
    }


}
