package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
11. Za unete brojeve a i b ispisati veci od njih.
 */
public class DZ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.println("Unesite broj b: ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
