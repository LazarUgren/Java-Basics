package DopunskaDva;

import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 4. Za unet negativan ceo broj n,
        ispisati sve brojeve od i
        zakljucno sa n do i zakljucno sa 0.
         */

        int n = sc.nextInt();
        for (n=n; n <= 0; n++){
            System.out.println(n);
        }

    }
}
