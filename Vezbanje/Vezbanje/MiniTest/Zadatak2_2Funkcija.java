package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak2_2Funkcija {
    /*
    Napisati funkciju koja ispisuje poruku:
    "Paran" ako je prosledjen broj paran
    "Neparan" ako je prosledjen broj neparan
     */

    public static void parNepar(int broj){//void funkcija nista ne vraca.
        if (broj % 2 == 0){// ona ima samo neku radnju koju nakon pozovemo u mainu
            System.out.println("Paran");// i ona se u majnu izvrsi.
        }// interesantno je zasto je ona static. ako static ima fiksno jedno mesto za cuvanje
        else {
            System.out.println("Neparan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        parNepar(broj);
        System.out.println("___");
        parNepar(5);// a moze i ovako, rucan unos umesto skenera.
    }


}
