package DomaciZadatci;

import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Dvadeseti20 {
    public static void main(String[] args) {
        /*
        20.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
	su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
	Npr:
	"Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
	"Branko", "Aleksandar", "Marko" -> "ne"
	"Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj imena: ");
        int n = sc.nextInt();
        int x [] = new int[n];
        System.out.println("Unesite imena: ");
        char[] data = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        String ime = sc.next();
        System.out.println(ime);
        for (int i = 2; n >= i; i++) {
                ime = sc.next();
            System.out.println(ime);
            }


        // NEURANDJEN!








            /*
            public static int Compare (string? strA, int indexA, string? strB, int indexB, int length, System.Globalization.CultureInfo?
             culture, System.Globalization.CompareOptions options);
             */


        //String [] nizBoja = new String[4];

    }
}


            /*
        ime = new String(data);
         */
        /*
        String str = "abc";
String repeated = str.repeat(3);

repeated.equals("abcabcabc");
+++++++++++++++++++++++++++++
repeated = new String(new char[n]).replace("\0", s);
         */







