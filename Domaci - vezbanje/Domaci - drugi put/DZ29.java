package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
29. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
b) Napraviti funkciju koja vraca sumu prosledjenog niza.
 */
public class DZ29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesi " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        suma(niz);

    }

        public static int suma (int [] niz){
        int suma = 0;
        for (int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
            System.out.println(suma);
        return suma;
        }

}
