package PrviDrugiTreciCas;

import java.util.Scanner;

public class Podatci {
    public static void main(String[] args) {

        /*
        Kreiramo svoj profil na ovom zadatku
        Svako za sebe kroz skener treba da unese ime, prezime, godine
        Koristeci char uneti pol, koristeci boolean odgovoriti na pitanje da li ste rodjeni u srbiji
        koristeci double uneti svoj prosek ocena iz srednje skole
        koristeci if program treba da vrati podatke na osnovu proseka da li ste bili odlicni, vrlo dobri ili dobri
        na kraju odstampati i odgovor da li je godina vaseg rodjenja bila prestupna
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase podatke");
        String ime = sc.next();
        String prezime = sc.next();
        int godine = sc.nextInt();
        char pol = 'm';
        boolean rodjeni = true;
        System.out.println(ime + prezime + godine + pol +rodjeni);
        int godiste = 2021 - godine;
        if (godiste%4==0) {
            System.out.println("Godina kada ste rodjeni je prestupna");
        } else {
            System.out.println("Godina kada ste rodjeni NIJE prestupna");
        }

        double prosek = sc.nextDouble();

        // && i (and)
        // || ili (or)

        /*if (prosek < 0) {
            System.out.println("Prosek ne sme biti negativan");
        } else if (prosek >= 0 && prosek < 1.5) {
            System.out.println("Bili ste nedovoljan djak");
            
        } else if (prosek >= 1.5 && prosek < 2.5) {
            System.out.println("Bili ste dovoljan djak");
            
        } else if (prosek >= 2.5 && prosek < 3.5) {
            System.out.println("Bili ste dobar djak");
            
        } else if (prosek >= 3.5 && prosek < 4.5) {
            System.out.println("Bili ste vrlo dobar djak");
            
        } else if (prosek >= 4.5 && prosek <= 5) {
            System.out.println("Bili ste odlican djak");

        } else if (prosek > 5) {
            System.out.println("Prosek moze biti do 5.00");
            
        }*/

        // Iznad je primer od 0 do 5, a ispod ide primer
        // od 5.00 do 0, dakle skala od 0-5 i od 5-0

        //--------------------------------------

        if (prosek > 5) {
            System.out.println("Prosek moze biti do 5.00");
        } else if (prosek >= 4.5) {
            System.out.println("Bili ste odlican djak");
        } else if (prosek >= 3.5) {
            System.out.println("Bili ste vrlo dobar djak");
        } else if (prosek >= 2.5) {
            System.out.println("Bili ste dobar djak");
        } else if (prosek >= 1.5) {
            System.out.println("Bili ste dovoljan djak");
        } else if (prosek >= 0) {
            System.out.println("Bili ste nedovoljan djak");
        } else {
            System.out.println("Prosek ne moze biti negativan");
        }





    }
}
