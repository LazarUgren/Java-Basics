package DomaciZadatci;

import java.util.Scanner;

public class Petnesti15 {
    public static void main(String[] args) {

        /*
        15. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println("Suma umetog broja je: " + suma * 1.00);


    }
}
