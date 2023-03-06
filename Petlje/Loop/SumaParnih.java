package Loop;

import java.util.Scanner;

public class SumaParnih {
    public static void main(String[] args) {

        // Suma parnih brojeva do N

        System.out.println("Prikazati sumu parnih brojeva do n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* n je 9
        0 1 2 3 4 5 6 7 8 n
         */

        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);

    }
}
