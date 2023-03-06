package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
41. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
 */
public class DZ41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }
        sumaProizvod(niz);


    }

    public static void sumaProizvod (int[] niz){
        int sumaNiza = 0;
        int proizvodNiza = 1;
        for (int i = 0; i < niz.length; i++){
            sumaNiza = sumaNiza + niz[i];
        }
        for (int i = 0; i < niz.length; i++){
            proizvodNiza = proizvodNiza * niz[i];
        }
        if (sumaNiza > proizvodNiza){
            System.out.println("Suma niza je veca od proizvoda niza");
        } else if (sumaNiza < proizvodNiza) {
            System.out.println("Suma niza je manja od proizvoda niza");
        } else {
            System.out.println("Suma niza je jednaka proizvodu niza");
        }
    }



}
