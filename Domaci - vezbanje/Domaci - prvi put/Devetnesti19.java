package DomaciZadatci;

import java.util.Scanner;

public class Devetnesti19 {
    public static void main(String[] args) {
        /*
        19. Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double). Validni predmeti su:
    {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
	Na standardni izlaz ispisati poruku:
	"{ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}",
	gde je atribut:
	1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
	2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
	3.) "veoma los/a", ako je prsoecna ocena ispod 2.5
	kategorija predmeta:
	1.) "prirodnih nauka" - Matematika, Fizika, Hemija
	2.) "jezika" - Srpski, Engleski
	3.) "opstih predmeta" - Biologoija, Istorija, Geografija
	Dakle, za unos:
	- "Ana Brankovic", "Biologija", 4.2
	poruka bi izgledala:
	"Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija"
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase ime i prezime: ");
        String imeIPrezime = sc.nextLine();
        System.out.println("Unesite predmet: ");
        String imePredmeta = sc.nextLine();
        System.out.println("Unesite prosecnu ocenu navedenog predmeta: ");
        double prosecnaOcenaNavedenogPredmeta = sc.nextDouble();
        String KategorijePredmeta = imePredmeta;
        String atribut = "aka";

        while (prosecnaOcenaNavedenogPredmeta >= 1 && prosecnaOcenaNavedenogPredmeta <= 5) {
                if (prosecnaOcenaNavedenogPredmeta <= 2.4) {
                    atribut = "veoma los/a";
                    break;
                } else if (prosecnaOcenaNavedenogPredmeta >= 2.5 && prosecnaOcenaNavedenogPredmeta <= 3.4) {
                    atribut = "dobar/ra";
                    break;
                } else if (prosecnaOcenaNavedenogPredmeta >= 3.5 && prosecnaOcenaNavedenogPredmeta <= 5) {
                    atribut = "veoma dobra/ra";
                    break;
                }
                prosecnaOcenaNavedenogPredmeta++;
        }

        switch (KategorijePredmeta) {
            case "Matematika", "Fizika", "Hemija":
                KategorijePredmeta = "prirodnih nauka";
                break;
            case "Srpski", "Engleski":
                KategorijePredmeta = "jezika";
                break;
            case "Biologija", "Istorija", "Geografija":
                KategorijePredmeta = "opstih predmeta";
                break;
        }
            System.out.println(imeIPrezime + " je " + atribut + " iz " + KategorijePredmeta + ", jer je imao/la " +
                    "prosecnu ocenu " + prosecnaOcenaNavedenogPredmeta + " iz predmeta " + imePredmeta);

    }
}
