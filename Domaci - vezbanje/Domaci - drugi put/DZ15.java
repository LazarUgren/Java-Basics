package DomaciZadatci.DZ0;
/*
15. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
 */

import java.util.Scanner;

public class DZ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++){
            suma = suma + i;
        }
        System.out.println(suma * 1.0);

        /*
        1 + 2 + 3 + 4 + 5 + 6 = 21
        1 = 1 + 1
        2 = 2 + 2
        4 = 4 + 4
        8 = 8 + 8
         */
    }
}
