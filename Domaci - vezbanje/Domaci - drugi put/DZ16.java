package DomaciZadatci.DZ0;
/*
16. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).
 */

import java.util.Scanner;

public class DZ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int proizvod = 1;

        for (int i = 1; i <= n; i++){
            proizvod = proizvod * i;
        }
        System.out.println(proizvod * 1.0);
        /*
        1 * 2 * 3 * 4 * 5 = 120
        1 = 1 * 2
        2 = 2 * 3
        6 = 6 * 4
        24 = 24 * 5
        120 = 120 * 6
         */
    }
}
