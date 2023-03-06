package DopunskaDva;

import java.util.Scanner;

public class Artikli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        25. Korisnik unosi novac na racunu koji raspolaze kao i cenu nekog
        artikla. Na standardni izlaz ispisati koliko kopija tog artikla
        korisnik moze da kupi.
         */

        System.out.println("Unesite kolicinu novca");
        double novac = sc.nextDouble();
        System.out.println("Unesite cenu artikla: ");
        double artikal = sc.nextDouble();
        int rez = 0;
        while (novac >= artikal){
            novac = novac - artikal;
            rez++;
        }
        System.out.println("Preostalo je novca " + novac);
        System.out.println("Mozete da kupite " + rez + " artikala");

    }
}
