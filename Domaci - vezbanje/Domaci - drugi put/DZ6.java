package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
6. Ispisati proizvod prvih n celih brojeva [1, n].
 */
public class DZ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();

        //uneti broj * 1, uneti broj * 2, uneti broj * 3 i tako dalje

        for (int i = 1; i <= broj; i++){
            int proizvod = broj * i;
            System.out.println(proizvod);
        }

    }
}
