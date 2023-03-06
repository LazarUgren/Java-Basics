package Vid16VezbeNizoviFunkcije;
/*
Treci zadatak:
Napisati program koji od korisnika zahteva da unese duzinu niza
zatim od korisnika zahteva da unese sve elemente
zatim ispisati niz koji je korisnik uneo
za ispis niza takodje napisati metodu

zatim

napisati metodu koja proverava da li je niz polindrom
niz je polindrom ako se isto "cita" sa leva na desno i sa desna na levo
npr
niz {1, 2, 3, 4, 3, 2, 1} je polindrom
niz {1, 2, 3, 4} nije polindrom

zatim

ispisati da li je niz koji je korisnik uneo polindrom
 */

import java.util.Scanner;

public class TreciZadatak {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesi " + (i+1) + ". element niza");
            niz[i] = sc.nextInt();
        }
        System.out.println("Niz koji ste uneli izgleda ovako: ");
        ispisiNiz(niz);

        int[] obrnutiNiz = obrniNiz(niz);

        System.out.println("Obrnuti niz izgleda ovako: ");
        ispisiNiz(obrnutiNiz);

        boolean polindron = daLiJePolindrom(niz);
        if (polindron == true) {
            System.out.println("Uneti niz JESTE polindrom");
        } else {
            System.out.println("Uneti niz NIJE polindrom");
        }
    }

    public static void ispisiNiz(int[] n) {
        System.out.print("{");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != n.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] obrniNiz(int[] niz) {
        int[] noviNiz = new int [niz.length];

        for (int i = 0, j = niz.length - 1; i < niz.length; i++, j--) {
            noviNiz[j] = niz[i];
        }
        return noviNiz;
    }
    public static int[] obrnutiNizNaDrugiNacin(int[] niz) {
        for (int i = 0, j = niz.length - 1; i < j; i++, j--) {
            int c = niz[i];
            niz[i] = niz[j];
            niz[j] = c;
        }
        return niz;
    }
    public static int[] obrnutiNizNaTreciNacin(int[] niz) {
        for (int i = 0; i < niz.length - 1 - i; i++) {
            int c = niz[i];
            niz[i] = niz[niz.length - 1 - i];
            niz[niz.length - 1 - i] = c;
        }
        return niz;
    }
        /*
        Ovo nagore je sve prvi zadatak(copy/paste), a nadole trebam da odradim jedan mali dodatak
        o polindromu i to je to (trebam da uradim jednu metodu)
         */

   public static boolean daLiJePolindrom (int[] niz) {
        /*
        Vratiti true ako jeste
        Vratiti false ako nije
        */
        boolean polindrom = true;
        for (int i = 0, k = niz.length - 1; i < niz.length / 2; i++, k--) {
            if (niz[i] != niz[k]) {
                polindrom = false;
                break;

            }
        }
        return polindrom;
    }



}
