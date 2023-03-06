package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
43. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
 */
public class DZ43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        String[] nizImena = new String[duzinaNiza];

        for (int i = 0; i < nizImena.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            nizImena[i] = sc.next();
        }
        provera(nizImena);

    }


    public static void provera (String[] niz){
        for (int i = 0; i < niz.length; i++){
            if (niz[i].equals("Marija") || niz[i].equals("Petar")){
                System.out.println("Unutar niza nalazi se clan cija je vrednost: " + niz[i]);
            }

        }




    }


}
