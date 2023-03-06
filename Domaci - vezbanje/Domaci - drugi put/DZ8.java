package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
 */
public class DZ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.next();
        System.out.println("Unesite prezime: ");
        String prezime = sc.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();
        int trenutnaGodina = 2021;
        int starost = trenutnaGodina - godinaRodjenja;
        
        if (starost < 7){
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
        } else if (starost > 19) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu");
        } else if (starost >= 7 && starost <= 19) {
            switch (starost){
                case 7:
                    System.out.println("Dobrodosao u prvi razred " + ime + " " + prezime);
                    break;
                case 8:
                    System.out.println("Dobrodosao u drugi razred " + ime + " " + prezime);
                    break;
                case 10:
                    System.out.println("Dobrodosao u treci razred " + ime + " " + prezime);
                    break;
                case 11:
                    System.out.println("Dobrodosao u cetvrti razred " + ime + " " + prezime);
                    break;
                case 12:
                    System.out.println("Dobrodosao u peti razred " + ime + " " + prezime);
                    break;
                case 13:
                    System.out.println("Dobrodosao u sesti razred " + ime + " " + prezime);
                    break;
                case 14:
                    System.out.println("Dobrodosao u sedmi razred " + ime + " " + prezime);
                    break;
                case 15:
                    System.out.println("Dobrodosao u osmi razred " + ime + " " + prezime);
                    break;
                case 16:
                    System.out.println("Dobrodosao u deveti razred " + ime + " " + prezime);
                    break;
                case 17:
                    System.out.println("Dobrodosao u deseti razred " + ime + " " + prezime);
                    break;
                case 18:
                    System.out.println("Dobrodosao u jedanesti razred " + ime + " " + prezime);
                    break;
                case 19:
                    System.out.println("Dobrodosao u dvanesti razred " + ime + " " + prezime);
                    break;
            }
        }


    }
}
