package DomaciZadatci;

import java.util.Scanner;

public class Osmi {
    public static void main(String[] args) {
        /*
        Korisnik unosi ime, prezime i godinu rodjenja.
        Ispisati: "Dobrodosao u {x}. razred, {ime} {prezime}",
        pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12
        razreda. A ako korisnik nije djak ispisati jednu odgovarajucu poruku
        od: "{ime}{prezime} je zavrsio skolu" ili "{ime}{prezime} tek treba da zapocne obrazovanje"
         */

        /*
        2022 = 2022 - 12 = 2010
        >= 2010
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = sc.next();
        System.out.print("Unesite prezime: ");
        String prezime = sc.next();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();
        int sadasnjaGodina = 2022;
        int starost = sadasnjaGodina - godinaRodjenja;






















    }
}
