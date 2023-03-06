package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
14. Napraviti digitron koji prima double, char, double,
 gde je char neki od simbola: {+, -, *, /, %, ^}
  i ispisuje resenje odgovarajuce operacije.
 */
public class DZ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        double a = sc.nextDouble();
        System.out.println("Odaberite operaciju: ");
        String operacija = sc.next();
        System.out.println("Unesite broj: ");
        double b = sc.nextDouble();
        double c = 0;

        switch (operacija){
            case "+":
                c = a + b;
                System.out.println(c);
                break;
            case "-":
                c = a - b;
                System.out.println(c);
                break;
            case "*":
                c = a * b;
                System.out.println(c);
                break;
            case "/":
                c = a / b;
                System.out.println(c);
                break;
            case "%":
                c = a % b;
                System.out.println(c);
                break;
            case "^":
                c = a * a;
                System.out.println(c);
                break;
        }

    }
}
