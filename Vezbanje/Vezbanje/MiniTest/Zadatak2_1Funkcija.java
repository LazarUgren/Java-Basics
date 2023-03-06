package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak2_1Funkcija {
    /*
    Napisati funkciju koja vraca odgovor da li osoba sa prosledjenim
    brojem godina moze da podigne vozacku dozvolu ili ne.

    15 -> "Ne mozete podici dozvolu"
    18 -> "Mozete da podignete dozvolu"
    50 -> "Mozete da podignete dozvolu"
    65 -> "Mozete podignuti dozvolu"
    68 -> "Ne mozezete podignuti dozvolu

    dakle, od 18 do 65 mozes da podignes dozvolu.
     */


    public static String dozvola (int godine){
        String odgovor;
        if (godine >= 18 && godine <= 65){
            odgovor = "Mozete da podignete dozvolu";
        } else {
            odgovor = "Ne mozete da podignete dozvolu";
        }
        return odgovor;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj godina: ");
        int godine = sc.nextInt();
        System.out.println(dozvola(godine));
    }

}
