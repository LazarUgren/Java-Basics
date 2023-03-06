package PrviDrugiTreciCas;

import java.util.Scanner;

public class Nula {
    public static void main(String[] args) {
        //Unesi pozitivan broj

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan broj");

        int i = sc.nextInt();

        if (i > 0) {
            System.out.println("Broj je pozitivan");
        } else if (i == 0) {
            System.out.println("Broj je 0");

        } else if (i < 0) {
            System.out.println("Broj je negativan");

        }

    }
    }

