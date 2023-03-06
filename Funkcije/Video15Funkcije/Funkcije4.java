package Video15Funkcije;

import java.util.Scanner;

public class Funkcije4 {
    public static void main(String[] args) {
        // Brojevi
        // public static void i public static int su dva nacina da se uradi jedna te ista stvar.
        // tj. da se isporuci isti rezultat
        // Sabiranje3 je primer sa skenerom, mada u testiranju se nikada ne koristi skener

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi dva broja za sabiranje");
        System.out.println("Zbir je: ");
        sabiranje(2, 3);

        System.out.println("..........................");

        System.out.println(sabiranje2(5, 7));

        System.out.println("...........................");

        sabiranje3(sc.nextInt(), sc.nextInt());


    }

        public static void sabiranje(int x, int y) {
            int z = x + y;
            System.out.println(z);
        }

        public static int sabiranje2(int q, int w) {
            int e = q + w;
            return e;
        }

        public static void sabiranje3 (int a, int s) {
            int d = a + s;
            System.out.println(d);
        }

}
