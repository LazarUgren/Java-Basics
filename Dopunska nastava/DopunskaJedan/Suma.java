package DopunskaJedan;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        DopunskaJedan.Suma do n:
        Izracunati sumu brojeva od 1 do n. n uneti iz konzole.
         */

        int n = sc.nextInt();

        /*
        5
        1 + 2 + 3 + 4 + 5 = 15
        3 + 3 + 9 = 6 + 9 = 15 (ovo racuna insturktor)
        6 + 4 + 5 = 15 (ovo ja racunam)
         */
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i; // 0 + 1 = 1
        }
        System.out.println(suma);

    }
}
