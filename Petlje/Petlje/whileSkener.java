package Petlje;

import java.util.Scanner;

public class whileSkener {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj");
        int i = sc.nextInt();

        while (i < 10 && i > 3) {
            System.out.println("Otvaram petlju" + i + ". put");
            i++; // bez inkrementacije se ponavlja uneta vrednost beskonacno
            // inkrementacija svako ponavljanje iyvodi sa +1
            /*
            5
            6
            7
            8
            9
             */

        }

    }
}
