package Nizovi;

public class ZadatakPetSaCasa {
    public static void main(String[] args) {
        /*
        zadatak 5: Napraviti niz integera i prikazati koji
        elementi su deljivi sa 3
        dodatka: ako ni jedan nije deljiv sa 3 dodati
        "nije deljiv sa 3 ni jedan clan niza"
         */

         //int[] nizInt = {3, 5, 8, 24, 11, 35, 57, 89, 256, 21, 81};
        int suma = 0;
        boolean deljiv = false;
        int[] nizInt = {5, 7, 8, 11};

        for (int i = 0; i < nizInt.length; i++) {
            if (nizInt[i] % 3 == 0) {
                System.out.println(nizInt[i]);
                deljiv = true;
            }

        }
        if (deljiv == false) {
            System.out.println("Nijedan clan nije deljiv sa 3");
        }

    }
}
