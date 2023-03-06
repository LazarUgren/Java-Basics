package Nizovi;

public class NizZadatakSestSaCasa {
    public static void main(String[] args) {

        /*
        Napraviti niz od 10 brojeva koji ce se sabirati do 100,
        kada predje 100 treba ispisati za koliko je presao
        na primer, ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        treba da nam ispise 80, 10, 9, 3 i onda poruka
        "Presli ste granicu za 2"
         */

        int[] nizOd10 = {20, 20, 20, 20, 20, 21, 22, 23, 24};
        int suma = 0;


        for (int i = 0; i < nizOd10.length; i++) {
            suma = suma + nizOd10[i];

            if (suma > 100) {
                System.out.println("Presli ste granicu za: " + (suma - 100));
                    break;

                }



            }

        }

    }

