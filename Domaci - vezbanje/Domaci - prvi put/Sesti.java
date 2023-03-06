package DomaciZadatci;

import java.util.Scanner;

public class Sesti {
    public static void main(String[] args) {
        /*
        Ispisati proizvod prvih n celih brojeva [1, n].
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            n = n * i;
        }
        System.out.println(n);


    }
}
