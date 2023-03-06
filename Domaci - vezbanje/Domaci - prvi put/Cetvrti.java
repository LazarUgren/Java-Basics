package DomaciZadatci;

import java.util.Scanner;

public class Cetvrti {
    public static void main(String[] args) {
        /*
        Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n
        do i zakljucno sa 0.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();
        int ispis = n-1;
        for (int i = 0; i >= n; --i) {
            ispis = ispis + 1;
            System.out.println(ispis);

            /*
            Ovaj zadatak je komplikovaniji od predhodnog. Imao sam problema
            kako da shvatim kako da postavim negativnu tacku s koje krecem.
            Kod pozitivnog bi to bila nula pa kreces da brojis 12345.
            U ovom slucaju pocetna tacka mi je uneta n...prvo sam mislio da
            deklarisem int i = -(maksimalna vrednost)128
            Ne znam da li bi ta ideja uspela, nisam je probao...to bih morao u
            petlji da deklarisem pa da brojim od -128 prema nula...
            probao sam i da petljam sa tackom u kojoj trebam da zavrsim, pa sam
            pogledao koje sve opcije mogu da probam i sta one rade...
            medjutim u jednom momentu mi je doslo...int pocetna tacka mi je
            jednaka sa n brojem koji unosim u skener, i rekoh hajd da probam
            to da deklarisem pa da vidim sta ce biti i TADA!
            Medjutim imam problem sa int ispis = n; na unetu vrednost on
            ispisuje -4 -3 -2 -1 0 1...ovo nije trazeni rezultat
            pa sam korigovao na int ispis = n-1; i to je to.
            Moze li ovo biti uradjeno na neki drugi nacin? I ako moze, da li je
            taj drugi nacin bolji od nacina na koji sam ja uradio?
             */

        }
    }
}
