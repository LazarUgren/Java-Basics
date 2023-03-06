package PrviDrugiTreciCas;

import java.util.Scanner;
//Primer skenera zadatak racunanje povrsine

public class DrugiProjekat{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi stranicu a");

        double a = sc.nextDouble();
        double Pk = a * a;
        System.out.println("Povrsina kvadrata je "+ Pk + " cm^2");

        System.out.println("Unesite stranicu r");
        double r = sc.nextDouble();
        double pi = 3.14;
        double Pr = r * r * pi;
        System.out.println("Povrsina kvadrata je "+ Pr + " cm^2");

    }



}

