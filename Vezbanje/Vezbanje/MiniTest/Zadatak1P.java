package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

import java.util.Scanner;

public class Zadatak1P {
    public static void main(String[] args) {
        /*
        Korisnik unosi brojeve m i n.
        Ispisati sve brojeve izmedju m i n.
        npr: br 5 i br 11
        ispis: 5, 6, 7, 8, 9, 10, 11
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj m: ");
        int m = sc.nextInt();
        System.out.println("Unesi broj n: ");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++){
            System.out.println(i);
        }

        for (int i = n; i >= m; i--){
            System.out.println(i);
        }
    }
}
