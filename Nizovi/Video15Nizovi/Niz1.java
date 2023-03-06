package Video15Nizovi;

import java.util.Scanner;

public class Niz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi velicinu niza");
        int[] broj = new int[sc.nextInt()];

        broj[0] = sc.nextInt();
        for (int i = 1; i < broj.length; i++) {
            broj[i] = sc.nextInt();
            if (broj[i] == broj[i-1]) {
                break;
            }
        }

        for (int i = 0; i < broj.length; i++) {
            System.out.println(broj[i]);
        }
    }
}
