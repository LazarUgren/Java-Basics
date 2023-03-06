package Vid16VezbeNizoviFunkcije;

import java.util.Scanner;

public class PetiZadatak {
    // dva skenera jedan je pokrio celu public klasu, a drugi je samo lokalnog karaktera u jednoj metodi.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesite vrednost a: ");
        int vrednostZaA = ucitajA();
        ispisiA(vrednostZaA);

        System.out.println("Unesite ponovo vrednost za a:");
        vrednostZaA = sc.nextInt();

    }

    public static void ispisiA (int a) {
        System.out.println("Vrednost a je " + a);
    }

    public static int ucitajA () {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }

}
