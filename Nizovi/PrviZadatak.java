package Vid16VezbeNizoviFunkcije;

import java.util.Scanner;

public class PrviZadatak {
    /*
    1 Zadatak - Napisati program koji od korisnika zahteva da unese duzinu niza
    zatim od korisnika zahteva da unese sve elemente
    zatim ispisati niz koji je korisnik uneo
    za ispis niza takodje napisati metodu
    zatim
    Napisati metodu koja kao argument prima niz
    a kao povratnu vrednost vraca niz koji je obrnut
    dakle ako posaljemo niz 1, 2, 3, 4
    metoda treba da vrati niz 4, 3, 2, 1
    zatim ispisati obrnuti niz
     */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        //pravim niz duzine koju je korisnik uneo
        /*
        Kada se ovako napravi niz inicijalno ima
        nule tipa niza na svakoj poziciji
            ako je niz celih brojeva (int[]), onda je 0 na svakoj poziciji niza
            ako je niz realnih brojeva (double[]), onda je 0.0 na svakoj poziciji niza
            ako je niz karaktera(charp[]), onda je '\0' na svakoj poziciji niza
            ako je niz boolean (boolean[]), onda je false na svakoj poziciji niza
         */

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i+1) + ". element niza");
            niz[i] = sc.nextInt();
        }

        System.out.println("Niz koji ste uneli izgleda ovako: ");
        ispisiNiz(niz);

        /*
        Uputstvo za promenu nacina rada (posto ih ima dva):
        int[] obrnutiNiz = obrnutiNiz(niz).....prvi nacin
        int[] obrnutiNiz = obrnutiNizNaDrugiNacin(niz)....drugi nacin
         */

        int[] obrnutiNiz = obrnutiNizNaTreciNacin(niz);

        System.out.println("Obrnuti niz izgleda ovako: ");
        ispisiNiz(obrnutiNiz);
    }

    public static void ispisiNiz(int[] n) {
        // {1, 2, 3, 4} hocu da ga ispisem u ovom formatu
        System.out.print("{");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != n.length - 1) {    // n.lenght - 1 je index poslednjeg elementa
                System.out.print(", ");  // ako i pokazuje na nesto sto nije poslednji element
            }// i < n.length - 1              // onda ispisujem zarez
                //Ovo je drugi nacina na koji moze da se uradi.
        }
        System.out.println("}");
    }

    public static int[] obrniNiz(int[] niz) {

        //pravimo noviNiz koji ce biti iste duzine kao i poslati niz
        int[] noviNiz = new int [niz.length];

        for (int i = 0, j = niz.length - 1; i < niz.length; i++, j--) {
            noviNiz[j] = niz[i];
        }
        return noviNiz;

    }

    public static int[] obrnutiNizNaDrugiNacin(int[] niz) {
        //bez pravljenja niza
        for (int i = 0, j = niz.length - 1; i < j; i++, j--) {
            int c = niz[i];
            niz[i] = niz[j];
            niz[j] = c;

            /*
            a takodje bi bilo validno da se uradi i na ovaj nacin
            c je treca casa
            niz[j] je prva casa
            niz[i] je druga casa
            int c = niz[j];
            niz[j] = niz[i];
            niz[i] = c;
             */
        }
        return niz;
    }

    public static int[] obrnutiNizNaTreciNacin(int[] niz) {
        //bez pravljenja novog niza, samo sa i (bez upotrebe j)
        for (int i = 0; i < niz.length - 1 - i; i++) {
            int c = niz[i];
            niz[i] = niz[niz.length - 1 - i];
            niz[niz.length - 1 - i] = c;

            /*
            a takodje bi bilo validno da se uradi i na ovaj nacin
            c je treca casa
            niz[j] je prva casa
            niz[i] je druga casa
            int c = niz[j];
            niz[j] = niz[i];
            niz[i] = c;
             */
        }
        return niz;

    }


/*
for(int i = 0, j = duzina niza - 1; i < (duzina niza / 2); i++, j--) {
sta moze da bude alternativni uslov ovde?
alternativni uslov moze biti i < j
c je treca casa
niz[j] je prva casa
niz[i] je druga casa
int c = niz[j];
niz[j] = niz[i];
niz[i] = c;
 */


}
