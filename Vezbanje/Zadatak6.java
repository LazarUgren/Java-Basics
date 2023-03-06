package Video17ShiftovanjeNiza;
/*
Drugi zadatak
Napisati program koji od korisnika zahteva da unese duzinu niza
zatim od korisnika zahteva da unese sve elemente
zatim ispisati niz koji je korisnik uneo
za ispis niza takodje napisati metodu

zatim

Napisati metodu koja niz shiftuje(pomera) za jedno mesto u levo, i vraca shiftovani niz
sta znaci shiftovati za jedno mesto u levo
{1, 2, 3, 4, 5}
shiftovan jedno mesto u levo izgleda ovako
{2, 3, 4, 5, 1}
dakle prvi element ide na poslednje mesto a svi ostali idu jedno mesto napred

zatim od korisnika traziti da unese za koliko mesta u levo zeli da shiftuje niz
zatim shiftovati niz za toliko mesta
i ispisati tako shiftovani niz
 */

import java.util.Scanner;

public class Zadatak6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < duzinaNiza; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            niz[i] = sc.nextInt();
        }
        System.out.println("Niz koji ste uneli izgleda ovako");
        ispisiNiz(niz);

        System.out.print("Unesti za koliko mesta u levo zelite da shiftujete niz: ");
        int shiftujULevoZa = sc.nextInt();

        int zaKolikoTrebaDaShiftujem = shiftujULevoZa % niz.length;
        /*
        ako je niz duzine od 5 clana i ti siftujes u levo 5 puta, niz izgleda kao na pocetku
        ako niz duzine 5 clana siftujes 6 puta ti si samo pomerio za jedno mesto tj.
        siftovao si ga za jedan clan u levo.
         */


        for (int i = 0; i < shiftujULevoZa; i++){
            niz = shiftJednoMestoULevo(niz);
        }
        System.out.println("Niz je shiftovan u levo za " + shiftujULevoZa + " mesto/a izgleda ovako: ");
        ispisiNiz(niz);


    }

    public static int[] shiftJednoMestoULevo (int[] niz) {
        int vrednostNaIndexu0 = niz[0];

        for (int i = 0; i < niz.length - 1; i++){
            niz[i] = niz[i+1];
        }
        niz[niz.length - 1] = vrednostNaIndexu0;

        return niz;
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
}
