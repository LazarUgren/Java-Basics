package DopunskaJedan;

import java.util.Scanner;

public class DupliFaktorijal2 {
    public static void main(String[] args) {

        // nastavak duplog faktorijala, ovde je rec o nacinu pisanja bez grananja dva puta

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;
        /*
        n = 5
        fact = 1
        i = 5

         */
        for (int i = n; i >= 1; i -= 2) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
