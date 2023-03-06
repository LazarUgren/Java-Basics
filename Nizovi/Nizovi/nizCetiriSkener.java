package Nizovi;

import java.util.Scanner;

public class nizCetiriSkener {
    public static void main(String[] args) {

        /*
        zadatak 4: napraviti niz od 5 elemenata, svaki element
        uneti preko skenera
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti nekoliko brojeva: ");

        int [] niz = new int [5];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        System.out.println("Uneti brojevi su: ");
        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);
        }



    }
}
