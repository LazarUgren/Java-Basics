package DomaciZadatci;

import java.util.Scanner;

public class Treci {
    public static void main(String[] args) {
        /*
        Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0
        do i zakljucno sa n.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int ispis = -1;
        for (int i = 0; i <= n; i++) {

            ispis = ispis + 1;
            System.out.println(ispis);

            /*
            15 red int = 0, imam problem, ispis je 1234567...sa korekcijom inta
            na -1 dobijam trazeni rezultat 0123456.
            Pitanje, da li mogu da dobijem zeljeni reyultat na neki drugi nacin?
            ili je neophodno da je int ispis = -1;?
             */
        }

    }
}
