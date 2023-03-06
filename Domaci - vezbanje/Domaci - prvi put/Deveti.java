package DomaciZadatci;

import java.util.Scanner;

public class Deveti {
    public static void main(String[] args) {
        /*
        Za ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv
        sa 3, "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve
        ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7,...)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int broj = sc.nextInt();
        String a = "Fizz";
        String b = "Buzz";
        String c = "Zazz";
        String d = "BuzzZazz";

        for (int i = 0; i < broj; i++) {
            if (broj % 3 == 0) {
                System.out.println(a);
            }
            if (broj % 5 == 0) {
                System.out.println(b);
            }
            if (broj % 7 == 0) {
                System.out.println(c);
            } break;
        }
        for (int i = 3; i < broj; i++) {
            int x = 5;
            if (broj % x == 0) {
                x+=2;
            }System.out.println(d);
            break;
        }

    }
}




