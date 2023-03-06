package Loop;

import java.util.Scanner;

public class SumaDoN {
    public static void main(String[] args) {

        System.out.println("prikazi mi sumu brojeva do n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 0 1 2 3 4 5 6 7 8 n  n = 9
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;

        }
        System.out.println(suma);

    }
}
