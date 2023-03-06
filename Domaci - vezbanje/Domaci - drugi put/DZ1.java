package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
 */
public class DZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        if (broj > 0 && broj % 2 == 0){
            System.out.println("Uneti broj je paran");
        } else if (broj > 0 && broj % 2 != 0) {
            System.out.println("Uneti broj je neparan");
        } else if (broj <= 0){
            System.out.println("Greska! Uneli ste nulu ili negativan broj.");
        }

    }
}
