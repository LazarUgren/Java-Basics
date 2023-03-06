package Funkcije;

public class Fun3 {

    /*
    Zadatak 3: U posebnoj metodi izracunati sumu parnih dvocifrenih brojeva
    U drugoj metodi izracunati sumu neparnih dvocifrenih brojeva
    U main metodi uporediti sume i odstampati koja suma je veca
     */

    public static void main(String[] args) {

        if (neparni() > parni()) {
            System.out.println("Suma neparnih je veca");
        } else {
            System.out.println("Suma parnih je veca");
        }

    }

    public static  int neparni() {
        int suma1 = 0;
        for (int i = 11; i < 100; i+=2) {
            suma1 = suma1 + i;
        }
        System.out.println(suma1);
        return suma1;
    }

    public static int parni() {
        int suma2 = 0;
        for (int i = 10; i < 100; i+=2) {
            suma2 = suma2 +i;
        }
        System.out.println(suma2);


       /* int j = 10; // ovo je primer ovde petlje sa while petljom
        while (j < 100) {
            suma2 = suma2 + j;
            j++;
            j++;
        }
        */
        return suma2;
    }

}
