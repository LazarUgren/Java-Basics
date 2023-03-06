package DopunskaJedan;

import java.util.Scanner;

public class Faktorijal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int proizvod = 1; // -5 -4 -3 -2 -1 (sabiranje negativnih-suma)
        if (n >= 1) {
            for (int i = n; i >= 1; i--) {
                proizvod = proizvod * i;
            }
        } else {
            for (int i = n; i <= -1; i++) {
                proizvod = proizvod * i;
            }

        }

        System.out.println(proizvod);
    }
}
