package DopunskaJedan;

import java.util.Scanner;

public class SuperMario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* (govorimo o umrezenim petljama ovde
        koristimo ih kada nesto iscrtavamo
        tipa kada koristimo tabele u exelu
        super mario kula uzeta kao primer

         1 2 3 4 5  --- (j) i (prva ide kroz redove(gore/dole), j (druga ide kroz kolone (levo/desno))
        1|*| | | | |
        2|*|*| | | |
        3|*|*|*| | |
        4|*|*|*|*| |
        5|*|*|*|*|*|
         */

        // 1 2 3 4 5
        // npr 3 je =
        // levo od 3 je <=
        // desno od 3 je >=

        /*
        1 2 3 4
        2 3 4 1
        3 4 1 2
        4 1 2 3
        1 2 3 4
        Ovde je potrebna dupla petlja, ako ovo zelimo da ispisemo
         */

        // prvo crtamo samo treci red jelkice
        // crtamo |*|*|*| | | (znamo da je visina 5 i da je ovo treci red)
        // treci red = i (broj zvezdica odgovara broju i)

        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                // i, j
                if (j <= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }

    }
}
