package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
33. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
 */
public class DZ33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        ispisNeparnih(niz);

    }



    public static void ispisNeparnih (int[] niz){
        for (int i = 0; i < niz.length; i++){
            if (niz[i] % 2 != 0){
                System.out.println(niz[i]);
            }
        }
    }

}
