package DopunskaJedan;

import java.util.Scanner;

public class JelkaJ {
    public static void main(String[] args) {

        System.out.println("Nacrtaj si jelku");
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n broj");
        int n = sc.nextInt();
        String z = "     ";
        String zv = "*";
        for (int i =0; i < n; i++) {
            for (int j =0; j < n; j++) {
                System.out.println(zv);
                zv = zv + zv;
            }
        }


    }
}
