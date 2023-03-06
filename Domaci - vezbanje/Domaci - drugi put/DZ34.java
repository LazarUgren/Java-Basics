package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
34. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.

 */
public class DZ34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        ispisParnih(niz);

    }

    public static void ispisParnih (int[] niz){
        for (int i = 0; i < niz.length; i++){
            if (niz[i] % 2 == 0){
                System.out.println(niz[i]);
            }
        }
    }


}
