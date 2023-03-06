package Video17ShiftovanjeNiza;

import java.util.Scanner;
/*
Napisati program koji racuna potrosnju goriva
Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
Motor trosi 5 litara goriva na 100 kilometara
Automobil trosi 7 litara goriva na 100 kilometara
Kombi trosi 11 litara na 100 km
Kamion trosi 15 litara na 100 km
Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch

primer ispisa u konzoli

Molim vas unesite tip vozila:
Kombi
Molim vas unesite distancu u kilometrima:
134
Kombi na 134.0 km potrosi 14.74 litara goriva

primer ispisa kada se unese pogresno vozilo

Molim vas unesite tip vozila:
Tenk
Molim vas unesite distancu u kilometrima:
133
Uneli ste pogresan tip vozila
 */

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tip vozila: ");
        String tipVozila = sc.next();

        System.out.println("Unesite distancu: ");
        double distance = sc.nextDouble();

        double potrosnja = 0;

        switch (tipVozila){
            case "Motor":
                potrosnja = distance * 5 / 100;
                System.out.println(tipVozila + " na " + distance + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Automobil":
                potrosnja = distance * 7 / 100;
                System.out.println(tipVozila + " na " + distance + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Kombi":
                potrosnja = distance * 11 / 100;
                System.out.println(tipVozila + " na " + distance + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Kamion":
                potrosnja = distance * 15 / 100;
                System.out.println(tipVozila + " na " + distance + " potrosi " + potrosnja + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
                break;
        }

    }
}
