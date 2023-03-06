package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
42. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
 */
public class DZ42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        double[] niz = new double[duzinaNiza];
        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            niz[i] = sc.nextInt();
        }

        prosecnaVrednostClanovaNiza(niz);
    }

    public static void prosecnaVrednostClanovaNiza (double[] niz){
        double suma = 0;
        double prosecnaVrednost = 0;
        for (int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
        for (int i = 0; i < niz.length; i++){
            prosecnaVrednost = suma / niz.length;
        }
        System.out.println(prosecnaVrednost);
    }

}
