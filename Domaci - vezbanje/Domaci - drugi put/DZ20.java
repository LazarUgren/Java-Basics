package DomaciZadatci.DZ0;
import java.util.Scanner;
/*
20.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
	su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
	Npr:
	"Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
	"Branko", "Aleksandar", "Marko" -> "ne"
	"Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)
 */
public class DZ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj n: ");
        int n = sc.nextInt();
        String k = "Unesite ime: ";
        String ime = "a";
        String ime2 = "b";

        for (int i = 0; i < n; i++){
            System.out.println(k);
            if (i % 2 == 0){
                ime2 = sc.next();
            } else {
                ime = sc.next();
            }
            if (ime.equals(ime2)){
                System.out.println("DA");
                break;
            }
        }
        if (!ime.equals(ime2)){
            System.out.println("NE");
        }


    }
}
