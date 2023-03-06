package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
 */
public class DZ7 {
    public static void main(String[] args) {
        /*
        1   Ovan 21 mart/20 april                  januar    <= 20 jarac     >= 21 vodolija
        2   Bik 21 april/21 maj                    februar   <= 19 vodolija  >= 20 ribe
        3   Blizanci 22 maj/21 jun                 mart      <= 20 ribe      >= 21 ovan
        4   Rak 22 jun/22 jul                      april     <= 20 ovan      >= 21 bik
        5   Lav 23 jul/23 avgust                   maj       <= 21 bik       >= 22 blizanci
        6   Devica 24 avgust/23 septembar          jun       <= 21 blizanci  >= 22 rak
        7   Vaga 24 septembar/23 oktobar           jul       <= 22 rak       >= 23 lav
        8   Skorpija 24 oktobar/22 novembar        avgust    <= 23 lav       >= 24 devica
        9   Strelac 23 novembar/21 decembar        septembar <= 23 devica    >= 24 vaga
        10  Jarac 22 decembar/20 jaunar///         oktobar   <= 23 vaga      >= 24 skorpija
        11  Vodila 21 januar/19 februar///         novembar  <= 22 skorpija  >= 23 strelac
        12  Ribe 20 februar/20 mart                decembar  <= 21 strelac   >= 22 jarac
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dobrodosli u konvertor horoskopskih znakova");
        System.out.print("Unesite dan rodjenja: ");
        int dan = sc.nextInt();
        System.out.print("Unesite mesec rodjenja malim slovima: ");
        String mesec = sc.next();
        String poruka = "Vas horoskopski znak je: ";

        if (mesec.equals("januar") || mesec.equals("februar") || mesec.equals("mart") || mesec.equals("april") || mesec.equals("maj") || mesec.equals("jun") || mesec.equals("jul") || mesec.equals("avgust") || mesec.equals("septembar") || mesec.equals("oktobar") || mesec.equals("novembar") || mesec.equals("decembar")){

        } else {
            System.out.println("Uneli ste pogresan mesec");
        }
        switch (mesec){
            case "januar"://<= 20 jarac     >= 21 vodolija
                if (dan > 0 && dan <= 20){
                    System.out.println(poruka + "jarac");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println(poruka + "vodolija");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "februar"://<= 19 vodolija  >= 20 ribe
                if (dan > 0 && dan <= 19){
                    System.out.println(poruka + "vodolija");
                } else if (dan >= 20 && dan <= 28) {
                    System.out.println(poruka + "ribe");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "mart"://<= 20 ribe      >= 21 ovan
                if (dan > 0 && dan <= 20){
                    System.out.println(poruka + "ribe");
                } else if (dan >= 21 && dan <= 31) {
                    System.out.println(poruka + "ovan");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "april"://<= 20 ovan      >= 21 bik
                if (dan > 0 && dan <= 20){
                    System.out.println(poruka + "ovan");
                } else if (dan >= 21 && dan <= 30) {
                    System.out.println(poruka + "bik");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "maj":// <= 21 bik       >= 22 blizanci
                if (dan > 0 && dan <= 21){
                    System.out.println(poruka + "bik");
                } else if (dan >= 22 && dan <= 31) {
                    System.out.println(poruka + "blizanci");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "jun":// <= 21 blizanci  >= 22 rak
                if (dan > 0 && dan <= 21){
                    System.out.println(poruka + "blizanci");
                } else if (dan >= 22 && dan <= 30) {
                    System.out.println(poruka + "rak");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "jul":// <= 22 rak       >= 23 lav
                if (dan > 0 && dan <= 22){
                    System.out.println(poruka + "rak");
                } else if (dan >= 23 && dan <= 31) {
                    System.out.println(poruka + "lav");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "avgust":// <= 23 lav       >= 24 devica
                if (dan > 0 && dan <= 23){
                    System.out.println(poruka + "lav");
                } else if (dan >= 24 && dan <= 31) {
                    System.out.println(poruka + "devica");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "septembar"://<= 23 devica    >= 24 vaga
                if (dan > 0 && dan <= 23){
                    System.out.println(poruka + "devica");
                } else if (dan >= 24 && dan <= 30) {
                    System.out.println(poruka + "vaga");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "oktobar"://<= 23 vaga      >= 24 skorpija
                if (dan > 0 && dan <= 23){
                    System.out.println(poruka + "vaga");
                } else if (dan >= 24 && dan <= 31) {
                    System.out.println(poruka + "skorpija");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "novembar":// <= 22 skorpija  >= 23 strelac
                if (dan > 0 && dan <= 22){
                    System.out.println(poruka + "skorpija");
                } else if (dan >= 23 && dan <= 30) {
                    System.out.println(poruka + "strelac");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
            case "decembar":// <= 21 strelac   >= 22 jarac
                if (dan > 0 && dan <= 21){
                    System.out.println(poruka + "strelac");
                } else if (dan >= 22 && dan <= 31) {
                    System.out.println(poruka + "jarac");
                } else {
                    System.out.println("Uneli ste pogresne podatke");
                }
                break;
        }


    }
}
