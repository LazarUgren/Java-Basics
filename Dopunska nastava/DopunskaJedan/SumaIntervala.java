package DopunskaJedan;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(Suma intervala) Korisnik unosi cele brojeve m i n sa konzole, m <= n.
        // Ispisati sumu brojeva (m, n).
        //(5, 5) = 5 = suma: 5

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;

            }
            System.out.println(sum); // 2 + 3 + 4 + 5 = 14
        }
    }
