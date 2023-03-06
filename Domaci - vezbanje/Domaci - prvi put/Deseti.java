package DomaciZadatci;

import java.util.Scanner;

public class Deseti {
    public static void main(String[] args) {
       /* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega
        (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = sc.nextInt();


        for (int t = 1; t < n; t++) {
            int suma = 0;
            System.out.println("Za t = " + t + " suma brojeva je: ");
            for (int j = 1; j <= t; j++) {
                suma += j;
            }
            System.out.println(suma);
        }

    }
}
