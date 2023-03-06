package DopunskaJedan;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /*
        n! = n * (n-1) * (n-2) * ... * 1 (ovo je neka definicija/ kako se radi)


         */
        int proizvod = 5;
        for (int i = n; i >= 1; i--) {
            proizvod = proizvod * i;
        }
        System.out.println(proizvod);
    }
}
