package Video17ShiftovanjeNiza;

import java.util.Scanner;

/*
Napisite program koji, koristi WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0
Primer ispisa resenja:

Molim vas unesite 1. broj
4
Trenutni zbir je 4
Molim vas unesite 2. broj
5
Trenutni zbir je 9
Molim vas unesite 3. broj
0
Uneli ste 0 Kraj programa
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int suma = 0;
        while (true){
            System.out.println("Molim vas unesite " + i + ". broj");
            int broj = sc.nextInt();
            if (broj == 0){
                System.out.println("Uneli ste 0 Kraj programa");
                break;
            } else {
                suma = suma + broj;
                System.out.println("Trenitni zbir je " + suma);
            }
            i++;
        }
    }
}
