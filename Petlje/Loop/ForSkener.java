package Loop;

import java.util.Scanner;

public class ForSkener {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (i = i; i < 10; i++) {
            System.out.println("Ovo je petlja" + i);
        }

    }
}
