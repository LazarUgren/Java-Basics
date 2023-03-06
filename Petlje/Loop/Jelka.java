package Loop;

import java.util.Scanner;

public class Jelka {
    public static void main(String[] args) {
        System.out.println("Nacrtaj mi jelku");
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n broj");
        int n = sc.nextInt();
        String z = " ";

        for (int i = 0; i < n; i++) {
            z = z + "*";
            System.out.println(z);
        }



    }
}
