package Video17ShiftovanjeNiza;

import java.util.Scanner;

/*
Zadatak4 - Napisite FUNKCIJU koja konvertuje iznos dinara u neko od ponudjenih valuta: evro, franak ili dolar
Korisnik unosi iznos dinara i valutu u koju zeli da konvertuje dinare
1 evro je 0,0085 dinara
1 franak je 0.0093 dinara
1 dolar je 0.010 dinara
Ispise vrsiti iskljucivo iz main metode!

Primer ispisa u konzoli:

Molim vas unesite iznos u dinarima:
1200
Molim vas da unesete valutu u koju zelite da konverujemo dinare:
evro
1200.0 dinara, kada se prebaci u evro, iznosi 10.2 u toj valuti

Primer ispisa u konzoli kad se unese pogresna valuta

Molim vas unesite iznos u dinarima:
123
Molim vas da unesete valutu u koju zelite da konverujemo dinare:
zlato
Niste unelu dobru valutu

 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molim vas unesite iznos u dinarima: ");
        double iznosUDinarima = sc.nextDouble();
        System.out.println("Molim vas unesite valutu u koju zelite da konvertujemo dinare: ");
        String valuta = sc.next();

        //dodatni poeni na testu (bitne stvari su u detaljima)
        if (iznosUDinarima < 0){
            System.out.println("Iznos koji ste uneli je manji od 0");
        }

        // prvi nacin
        if (!valuta.equals("evro") && !valuta.equals("dolar") && !valuta.equals("franak")){ //da li je uneo nesto sto nije evro i nije dolar i nije franak
            System.out.println("Niste uneli dobru valutu");
        }
        else {
            double konvertovano = konverzija(iznosUDinarima, valuta);
            System.out.println(iznosUDinarima + " dinara, kad se prebaci u " + valuta + " iznosi " + konvertovano + " u toj valuti.");
        }

        // drugi nacin
        if (valuta.equals("evro") || valuta.equals("dolar") || valuta.equals("franak")){ // da li je uneo nesto sto je evro ili dolar ili franak
            double konvertovano = konverzija(iznosUDinarima, valuta);
            System.out.println(iznosUDinarima + " dinara, kad se prebaci u " + valuta + " iznosi " + konvertovano + " u toj valuti.");
        }
        else {
            System.out.println("Niste uneli dobru valutu");
        }

        // treci nacin
        double konvertovano = konverzija(iznosUDinarima, valuta);

        if (konvertovano == -1){
            System.out.println("Niste uneli dobru valutu");
        } else {
            System.out.println(iznosUDinarima + " dinara, kad se prebaci u " + valuta + " iznosi " + konvertovano + " u toj valuti.");
        }



    }

    public static double konverzija (double iznosUDinarima, String konvertovatiUValutu) {
        double konvertovanaVrednost = -1;

        switch (konvertovatiUValutu){
            case "evro":
                konvertovanaVrednost = iznosUDinarima * 0.0085;
                break;
            case "dolar":
                konvertovanaVrednost = iznosUDinarima * 0.010;
                break;
            case "franak":
                konvertovanaVrednost = iznosUDinarima * 0.0093;
                break;
            default:
                konvertovanaVrednost = -1;
        }
        return konvertovanaVrednost;
    }

}
