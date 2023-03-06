package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
17.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n.
 Zatim se unose n double brojeva jedan po jedan.
  Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c,
   gde je x taj uneti broj.
 */
public class DZ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite double konstantu a: ");
        double a = sc.nextDouble();
        System.out.println("Unesite double konstantu b: ");
        double b = sc.nextDouble();
        System.out.println("Unesite double konstantu c: ");
        double c = sc.nextDouble();
        System.out.println("Unesite pozitivan ceo broj n: ");
        int n = sc.nextInt();
        double polinom = 0.00;

        int x = n;

        if (polinom == polinom) {
            polinom = a * (x ^ 2) + b * x + c;
        }
        System.out.println(polinom);
    }
}
