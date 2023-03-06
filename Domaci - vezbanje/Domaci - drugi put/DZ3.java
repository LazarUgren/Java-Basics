package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
 */
public class DZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan broj: ");
        int broj = sc.nextInt();

        if (broj < 0){
            System.out.println("Greska! Uneli ste negativan broj");
        } else {
            for (int i = 0; i <= broj; i++) {
                System.out.println(i);
            }
        }
    }
}
