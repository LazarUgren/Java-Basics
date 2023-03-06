package DopunskaDva;

import java.util.Scanner;

public class DesetiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 10. zadatak: Za unet pozitivan ceo broj n, ispisati za svaki ceo broj
        broj t, koji je strogo manji od njega (dakle, t < n), sumu svih
        pozitivnih celih brojeva od 1 do tog broja (dakle, 1 + 2 + 3 + ... + t).
         */

        /*
        n = 5
        t = 1
        [1, 1] = 1
        t = 2
        [1, 2] = 3
        t = 3
        [1, 2, 3] = 6
        t = 4
        [1, 2, 3, 4] = 10
         */

        /*
        t : 1 [1, 1] = 1
        t : 2 [1, 2] = 3
        t : 3 [1, 2, 3] = 6 | Ovo je t : 2 + 3 - trojka je iz reda gore
        t : 4 [1, 2, 3, 4] = 10 | Ovo je t : 3 + 4
         */

        int n = sc.nextInt();

        for (int t = 1; t < n; t++) {
            int sum = 0;
            System.out.print("Za t = " + t + " suma brojeva je: ");
            for (int j = 1; j <= t; j++) {
                sum += j;
            }
            System.out.println(sum);
        }

       /* int sum = 0;
        for (int t = 1; t < n; t++) {
            sum += t;
            System.out.println(sum);
        }*/



    }
}
