package Nizovi;

public class Niz {
    public static void main(String[] args) {

        // niz na engleskom se pise Array

        String [] nizBoja = new String[4]; // broj u zagradi nije indeksiran

        nizBoja[0] = "plava";
        nizBoja[1] = "crvena";
        nizBoja[2] = "ljubicasta";
        nizBoja[3] = "bela";

        /*
        System.out.println(nizBoja[0]);
        System.out.println(nizBoja[1]);
        System.out.println(nizBoja[2]);
        System.out.println(nizBoja[3]);
        */
        // Ovo iznad i ovo ispod su jedno te isto (for petlja za niz)

        int duzinaNiza = nizBoja.length;

        /*
        for (int i = 0; i < nizBoja.length; i++) {
            System.out.println(nizBoja[i]);
        }
        */

        //****************************************************

        String nizImena []  = {"Ana", "Nikola", "Marija", "Stefan"};

        /*
        for (int i = 0; i <nizImena.length; i++) {
            System.out.println((i+1) + " ime niza je " + nizImena[i]);
        }
        */
        //*********************************************************

        /*
        int[] nizBrojeva = {1, 2, 54, 1235, 1356};

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println(nizBrojeva[i]);
        }
        */

        /*
        int [] nizBrojeva = {123, 544, -124, 0};

        int c = nizBrojeva[0] + nizBrojeva[1];
        System.out.println(c); // 123 + 544 = 667 == c

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println(nizBrojeva[i]);
        }

         */

        //-----------------------------------------


        String[] nizSlatkisa = {"Cokolada", "Karamela", "Sladoled", "Voce"};


        for (int i = 0; i < nizSlatkisa.length; i++){
            System.out.println(nizSlatkisa[i]);
        }

        nizSlatkisa[1] = "Vanila";

        //nizSlatkisa[1] = 123;
        //program ne dopusta pogresan tip podataka










    }
}
