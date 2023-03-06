package DomaciZadatci;

import java.util.Scanner;

public class Osamnesti18 {
    public static void main(String[] args) {
        /*
        18.* Uneti pozitivan ceo broj n.
        Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 1.00);
          break;
        }
        System.out.println(n * 1.00);

    }
}
