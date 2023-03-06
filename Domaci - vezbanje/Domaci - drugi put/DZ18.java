package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
18.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).
 */
public class DZ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti pozitivan ceo broj n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i * 1.0);
            break;
        }
        System.out.println(n * 1.0);
    }
}
