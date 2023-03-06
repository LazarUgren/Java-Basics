package DomaciZadatci;

import java.util.Scanner;

public class Jedanesti {
    public static void main(String[] args) {
      /*  11. Za unete brojeve a i b ispisati veci od njih. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.println("Unesite broj b: ");
        int b = sc.nextInt();

        System.out.println("Veci broj od dva uneta je: ");

        boolean veciBroj = true;

        if (a > b) {
            veciBroj = true;
            System.out.println("broj a: " + a);
        } else if (b > a) {
            veciBroj = true;
            System.out.println("broj b: " + b);
        }

    }
}
