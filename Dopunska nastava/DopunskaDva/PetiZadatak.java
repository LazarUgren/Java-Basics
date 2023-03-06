package DopunskaDva;

import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        /* (5.) Za unet pozitivan ceo broj n, ispisati sve brojeve od i
        zakljucno sa -14 do i zakljucno sa 2n.
         */

        Scanner sc = new Scanner(System.in);

        int n = 5;
        for (int i = -14; i <= 2*n; i++){
            System.out.println("Kraj" + i);

        }
    }
}
