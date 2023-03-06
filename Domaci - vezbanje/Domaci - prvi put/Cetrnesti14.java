package DomaciZadatci;

import java.util.Scanner;

public class Cetrnesti14 {
    public static void main(String[] args) {
        /*
        14. Napraviti digitron koji prima double, char, double,
         gde je char neki od simbola: {+, -, *, /, %, ^}
         i ispisuje resenje odgovarajuce operacije.
         */

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String operacija = sc.next();
        double b = sc.nextDouble();
        double q = 0;
        double w = 0;
        double e = 0;
        double r = 0;
        double t = 0;
        double y = 0;

        switch (operacija) {
            case "+": {
                q = a + b;
                System.out.println(q);
                break;
            }
            case "-": {
                w = a - b;
                System.out.println(w);
                break;
            }
            case "*": {
                e = a * b;
                System.out.println(e);
                break;
            }
            case "/": {
                r = a / b;
                System.out.println(r);
                break;
            }
            case "%": {
                t = a % b;
                System.out.println(t);
                break;
            }
            case "^": {
                y = a * a;
                System.out.println(y);
                break;
            }
            default:
                System.out.println("Uneli ste pogresne podatke \n Pokusajte ponovo. Hvala.");
        }


    }
}
