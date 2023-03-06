package DopunskaJedan;

import java.util.Scanner;

public class DupliFaktorijalSaDesnaNaLevo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /*
        n!! = n * (n-2) * (n-4) * ... (1 ili 2)
        6!! = 6 * 4 * 2 * 1 = 48
        5!! = 5 * 3 * 1 = 15
         */
        int fact = 1;
        boolean prvaInterakcija = true;
        for (int i = 1; i <= n; i += 2) {
            if (n % 2 == 0) {
                fact *= i;
                if (prvaInterakcija) {
                    i--;
                }
            } else {
                fact *= i;
            }
            prvaInterakcija = false;
        }
        System.out.println(fact);
    }
}
