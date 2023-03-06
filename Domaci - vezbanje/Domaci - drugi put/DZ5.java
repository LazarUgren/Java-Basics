package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.
 */
public class DZ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan broj: ");
        int broj = sc.nextInt();

        for (int i = -14; i <= (2 * broj); i++){
            System.out.println(i);
        }
    }
}
