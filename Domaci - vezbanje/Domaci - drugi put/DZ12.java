package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
12. Za unete brojeve a, b i c ispisati najmanji od njih
 */
public class DZ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.println("Unesite broj b: ");
        int b = sc.nextInt();
        System.out.println("Unesite broj c: ");
        int c = sc.nextInt();

        if (a < b && a < c){
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else if (c < a && c < b) {
            System.out.println(c);
        }
    }
}
