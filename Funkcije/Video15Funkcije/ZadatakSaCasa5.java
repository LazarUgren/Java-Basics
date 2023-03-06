package Video15Funkcije;

import java.util.Scanner;

public class ZadatakSaCasa5 {
    public static void main(String[] args) {
        //Zadatak 3 - U main metodi treba proslediti godine i ispisati da li je osoba
        //punoletna ili nije,
        //koristiti drugu metodu za racunanje
        // Dodatak - testirati vise brojeva


        starosnaGranica(1994);
        System.out.println("......................");
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja:");
        punoletsvo(sc.nextInt());
        System.out.println("...........................");
        //nadole su resenja, ima ih vise.

        punoletstvoResenje(17);
        punoletstvoResenje(18);

        System.out.println("..............");
        System.out.println("Unesite godinu rodjenja:");
        int godiste = sc.nextInt();
        System.out.println(punoletan(godine(godiste)));




    }

    public static int starosnaGranica (int x) {
        int a = 2022;
        int c = a - x;
        if (c < 18) {
            System.out.println("Vi ste maloletna osoba");
        } else {
            System.out.println("Vi ste punoletna osoba");
        }
        return c;
    }

    public static void punoletsvo (int q) {
        int a = 2022;
        int c = a - q;
        if (c < 18) {
            System.out.println("Vi ste maloletna osoba");
        } else {
            System.out.println("Vi ste punoletna osoba");
        }


    }
    //......nadole su resenja ima ih vise......

    public static String punoletstvoResenje (int x) {
        String da = "Korisnik je punoletan";
        String ne = "Korisnik nije punoletan";

        if (x >= 18) {
            System.out.println(da + " i ima " + x + " godina");
            return da;
        } else {
            System.out.println(ne + " i ima " + x + " godina");
            return ne;
        }
    }

    //...........................

    public static int godine (int x) {
        int god = 2022 - x;
        return god;
    }
    public static boolean punoletan (int y) {
        if (y >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
