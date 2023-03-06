package DomaciZadatci;

import java.util.Scanner;

public class Prvi {
    public static void main(String[] args) {
        /* Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je
        neparan.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = sc.nextInt();



        for (int i = 1; i <= n; i += 2) {

            if (n % 2 == 0) {
                System.out.println("Broj je paran");
                break;
            } else {
                System.out.println("Broj je neparan");
                break;
            }
            /*
            Poceo sam petljim for, int i je tacka pocetka, bitno je da je
            i manje od n zato sto idemo sa desna na levo tj. delimo
            prema nuli. Inkrement je neophodan cisto formalno jer bez njega
            upadamo u beskonacnu petlju. Kada je inkrement definisan, onda
            imamo odredjen broj ponavljanja petlje, ali to meni ne treba.
            to je reseno komandom break pri kojoj nakon prvog prelaska
            preko petlje, tj. dolaska do breaka prekidamo petlju i to je to.
            u prvom slucaju ako je ostatak pri deljenju nula onda se
            stampa da je broj paran jer jeste paran :D
            Doduse ovo ne funkcioniose sa brojevima manjim od 0.
             */
        }












    }
}
