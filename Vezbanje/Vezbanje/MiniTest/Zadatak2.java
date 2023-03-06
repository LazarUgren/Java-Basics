package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak2 {
    //funkcija koja vraca zbir dva broja
    //-----------tip povratna vrednost/ime funkcije/argumenti funkcie
    public static int               saberiDvaBroja(int broj1, int broj2){
        int zbir = broj1 + broj2;
        return zbir;
    }

    /*
    "Pao je"
    "Nije pao"

    Pera -> "Pao je"
    Strahinja -> "Nije pao"
     */


    //'public static String' ... Ovaj deo funkcije nazivamo POTPIS FUNKCIJE
    public static String daLiJePao (String ime){
        String odgovor;
        if (ime.equals("Pera")){
            odgovor = "Pao je";
        }
        else {
            odgovor = "Nije pao";
        }
        return odgovor;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime ucenika: ");
        String imeUcenika = sc.next();
        String paoNijePao = daLiJePao(imeUcenika);//ovde funkcija postoji u programu. jedino mozemo videti podatke u debageru npr. ali oni nisu prisutni na izlazu konzole.
        System.out.println(paoNijePao); // ovde sadrzaj funkcije tj njen rezultat odstampamo i vidimo ga.

        System.out.println(daLiJePao(imeUcenika));// ovo je direktniji nacin
        //ide prvo u funkciju, a to je samo komanda kojoj treba materjal za rad
        //pa joj prosledimo ime ucenika i ona nam vrati "odgovor"


    }
}
