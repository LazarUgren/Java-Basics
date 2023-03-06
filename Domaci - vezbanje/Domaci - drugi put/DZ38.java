package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
38.* Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
 */
public class DZ38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        int[] niz2 = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz2[i] = sc.nextInt();
        }

        ispisiNiz(noviNiz(niz, niz2));


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
    public static int [] noviNiz (int[] niz1, int[] niz2){
        int[] niz3 = new int[niz1.length];
        for (int i = 0, j = 0, k = 0; i < niz1.length; i++, j++, k++){
            niz3[k] = niz2[j] + niz1[i];
        }
        return niz3;
    }



}
