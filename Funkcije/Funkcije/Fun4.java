package Funkcije;

import java.util.Scanner;

public class Fun4 {

    /*
    Preko skenera uneti broj, u drugoj metodi izracunati faktorijal
    tog broja i odstampati ga
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();
        System.out.println(faktorijal(broj));

    }

    public static int faktorijal(int x) {
        /*
        5! (jednako) je  5 * 4 * 3 * 2 * 1 --- faktorijal primer
         */

        int a = 1;

        for (int i = 1; i <= x; i++) {
            /* primer od 1 do 5 tj. od int i = 1 do i <= 5
            1
            1 * 2
            2
            2 * 3
            6
            6 * 4
             */
            a = a * i;
            /*
            1 = 1 * 1 ... a = 1
            1 = 1 * 2 ... a = 2
            2 = 2 * 3 ... a = 6
            6 = 6 * 4 ... a = 24
            24 = 24 * 5 ... a = 120
             */
        }
        return a;
    }




}
