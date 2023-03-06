package Vid16VezbeNizoviFunkcije;

import java.util.Scanner;

public class ZadatakSaSwitchem {
    public static void main(String[] args) {
        /* U svicu se koristi ili int ili char najcesce
        pa kada odaberemo int a, u svicu ga uporedjujemo sa
        mogucim granama koje smo napravili.
        On pronadje pravi case i izvrsi ga, i to je to.
         */
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Unesite broj od 1 do 5");

        a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Jedan");
                break;
            case 2:
                System.out.println("Dva");
                break;
            case 3:
                System.out.println("Tri");
                break;
            case 4:
                System.out.println("Cetiri");
                break;
            case 5:
                System.out.println("Pet");
                break;
            default:
                System.out.println("Uneli ste broj veci od 5");
                break;

        }

    }
}
