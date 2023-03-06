package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.
 */
public class DZ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        if (broj > 0){
            System.out.println("Uneti broj je pozitivan");
        } else if (broj == 0) {
            System.out.println("Uneti broj je neutralan");
        } else if (broj < 0) {
            System.out.println("Uneti broj je negativan");
        }
    }
}
