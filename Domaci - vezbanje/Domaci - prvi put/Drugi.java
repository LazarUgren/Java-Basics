package DomaciZadatci;

import java.util.Scanner;

public class Drugi {
    public static void main(String[] args) {
        /*
        Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
        "Negativan" ako je strogo manji od nule, ili
        "Neutralan" ako je tacno 0.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");

        int n = sc.nextInt();
        for (int i = 1; i >= 0; i++) {
            if (n > 0) {
                System.out.println("Broj je pozitivan");
                break;
            } else if (n == 0) {
                System.out.println("Broj je neutralan");
                break;
            } else if (n < 0) {
                System.out.println("Broj je negativan");
                break;
            }
        }
        /*Uspeo sam i drugi da uradim, yey, ali imam pitanje...
        kada stavim i >= n; kod ne funkcionise, zasto?
        Nije mi bas jasno, ali bitno je da radi ono sto su u zadatku trazili.
        Pre treceg zadatka poigraj se s ovim kodom da razjasnis nedoumice.
         */
    }
}
