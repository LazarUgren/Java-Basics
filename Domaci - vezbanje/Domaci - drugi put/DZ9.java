package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
 "Buzz" ako je deljiv sa 5,
  "Zazz" ako je deljiv sa 7
   i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
 */
public class DZ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        if (broj % 3 == 0){
            System.out.println("Fizz");
        } else if (broj % 5 == 0) {
            System.out.println("Buzz");
        } else if (broj % 7 == 0) {
            System.out.println("Zazz");
        }
        if (broj % 3 == 0 || broj % 5 == 0 || broj % 7 == 0) {
            System.out.println("BuzzZazz");
        }
    }
}
