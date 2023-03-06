package DomaciZadatci;

import java.util.Scanner;

public class Sesnesti16 {
    public static void main(String[] args) {
        /*
        16. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int proizvod = 1;
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            proizvod = proizvod * i;
        }
        System.out.println("Proizvod unetih narednih n brojeva je " + proizvod * 1.00);

    }
}
