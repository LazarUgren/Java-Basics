package Petlje;

import java.util.Scanner;

public class mojaPetlja1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite srecni broj");
        int i = sc.nextInt();


        while (i <= 66) {
            System.out.println("Vi ste nasa "+ i + ". musterija.");
            i++;
        }



    }
}
