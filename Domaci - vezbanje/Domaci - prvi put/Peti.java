package DomaciZadatci;

import java.util.Scanner;

public class Peti {
    public static void main(String[] args) {
        /*
        Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa
        -14 do i zakljucno sa 2n.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int ispis = -15;
        for (int i = -14; i <= 2*n; i++) {
            ispis = ispis + 1;
            System.out.println(ispis);
        }
    }
}
