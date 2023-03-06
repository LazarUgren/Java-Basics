package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
35.* Napisati funkciju koja vraca najveci element niza.
 */
public class DZ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        najveciClanNiza(niz);


    }

    public static void najveciClanNiza (int [] niz){
        int max = niz[0];
        for (int i = 0; i < niz.length; i++){
            if (max < niz[i]){
                max = niz[i];
            }
        }
        System.out.println(max);
    }


}
