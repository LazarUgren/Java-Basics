package DopunskaDva;

import java.util.Scanner;

public class OdabirPetlje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For  - Za | za svaki broj od 1 do n naci sumu tih brojeva
        //While - (sve) Dok | Sve korisnik ne unese pozitivan broj, traziti da
        // korisnik ponovo unosi broj

        //Ovde imas primer dve petlje koje cine istu stvar, jedna je obuhvacena
        // komentarom da bi drugu mogao da pokrenes


        System.out.println("Uneti pozitivan broj ");
        int x = sc.nextInt();

        while (x <= 0){
            System.out.println("Morate da unesete bas pozitivan broj");
            x = sc.nextInt();

        }
        System.out.println("Uneli ste pozitivan broj!");

        /*
        for (; x <= 0;){
            System.out.println("Morate da unesete bas pozitivan broj!");
            x = sc.nextInt();
        }
        System.out.println("Uneli ste pozitivan broj!");
        */
    }

}
