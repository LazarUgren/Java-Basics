package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1. Grananja i petlje (if, switch, for, petelja)
        prvi zadatak se odnosi na gradivo iz prve nedelje predavanja.
        ZADATAK:
        Korisnik unosi ocenu koju je ucenik dobio na maturi iz srp i mat i
        da li je ucenik "Osnovac" ili "Srednjoskolac".
        Izracunati koliko bodova nosi na prijemni ako:
        Osnovac: srednjaOcena * 5;
        Srednjoskolac: srednjaOcena * 2;

        4, 5 "Osnovac" -> 4.5 -> 22.5
        4, 5 "Srednjoskolac" -> 4.5 -> 9
         */

        System.out.println("Unos ocene iz srpskog: ");
        double ocenaSrpski = sc.nextDouble();
        System.out.println("Unos ocene iz matematike: ");
        double ocenaMatematika = sc.nextDouble();
        System.out.println("Da li je osnovac ili srednjoskolac: ");
        String ucenik = sc.next();
        double srednjaOcena = (ocenaSrpski + ocenaMatematika) / 2;

        if (ucenik.equals("Osnovac")){
            System.out.println(srednjaOcena * 5);
        } else if (ucenik.equals("Srednjoskolac")) {
            System.out.println(srednjaOcena * 2);
        }

    }
}
