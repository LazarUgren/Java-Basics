package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
31. -//-. Izracunati proizvod elemenata tog niza.
Primer: [2, 4] -> 8
b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.
 */
public class DZ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int [] niz = new int [duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        ispisP(niz);

    }
        public static void ispisP (int[] niz){
        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod = proizvod * niz[i];
        }
            System.out.println(proizvod);
        }



}
