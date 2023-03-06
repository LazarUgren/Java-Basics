package Video19toStringStringBuilder;
/*
.isBlank() klasa i jos neke druge klase koje se mogu pronaci u dokumentaciji
na sajtu orakle, orakle pravi javu...pa objavljuje klase koje koristimo
tipa Scanner je klasa koju koristim
Nadole imas jos neke klase i njihova objasnjenja
 */
public class isBlankString {
    public static void main(String[] args) {
        String a = "    ";
        String b = "";
        String c = "Ima podataka";

        if (a.isBlank() == true){
            System.out.println("Samo space");
        }else {
            System.out.println("Ima nekih podataka");
        }
        if (b.isBlank() == true){
            System.out.println("beline");
        } else {
            System.out.println("dugine boje");
        }
        if (c.isBlank() == true){
            System.out.println("prostor");
        } else {
            System.out.println("podatci");
        }
        String d = "Lazar Ugrenovic";

        System.out.println("Slovo v je na mestu " + d.lastIndexOf('v'));
        /*
        .lastIndexOf je klasa koja ti omogucuje da pronadjes jedan odredjeni
        karakter/char unutar jednog Stringa.
        Ovde trazim na kojoj je poziciji slovo v u svom Imenu i prezimenu (String)
         */
    }

}
