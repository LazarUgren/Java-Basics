package DopunskaJedan;

import java.util.Scanner;

public class DupliFaktorijal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /*
        n!! = n * (n-2) * (n-4) * ... (1 ili 2)
        6!! = 6 * 4 * 2 = 48
        5!! = 5 * 3 * 1 = 15
         */

        int fact = 1;
        if (n % 2 == 0) {
            // n je paran
            for (int i = n; i >= 2; i -= 2) {
                fact *= i;
            }
        }
        else {
            // n je neparan
            for (int i = n; i >= 1; i-= 2) {
                fact *= i;
            }
        }
        System.out.println(fact);
    }
}
