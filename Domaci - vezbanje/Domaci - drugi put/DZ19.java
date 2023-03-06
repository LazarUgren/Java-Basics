package DomaciZadatci.DZ0;

import java.util.Scanner;

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
public class DZ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime i prezime: ");
        String imeIPrezime = sc.nextLine();
        System.out.println("Unesite ime predmeta: ");
        String predmet = sc.nextLine();
        System.out.println("Unesite prosecnu ocenu: ");
        double prosecnaOcena = sc.nextDouble();
        String kategorijaPredmeta = "prazno";
        String atribut = "prazno";

        if (prosecnaOcena > 3.5){
            atribut = "veoma dobar/ra";
        } else if (prosecnaOcena >= 2.5 && prosecnaOcena <= 3.4) {
            atribut = "dobar/ra";
        } else if (prosecnaOcena < 2.5) {
            atribut = "veoma los/a";
        }

        if (predmet.equals("Matematika") || predmet.equals("Fizika") || predmet.equals("Hemija")){
            kategorijaPredmeta = "prirodnih nauka";
        } else if (predmet.equals("Srpski") || predmet.equals("Engleski")) {
            kategorijaPredmeta = "jezika";
        } else if (predmet.equals("Biologija") || predmet.equals("Istorija") || predmet.equals("Geografija") || predmet.equals("Fizicko")) {
            kategorijaPredmeta = "opstih predmeta";
        }
        System.out.println(imeIPrezime + " je " + atribut + " iz " + kategorijaPredmeta + ", jer je imao/la prosecnu ocenu " +  prosecnaOcena + " iz predmeta " + predmet);
    }
   // "Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija"
}
