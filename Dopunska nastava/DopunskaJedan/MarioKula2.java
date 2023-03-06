package DopunskaJedan;

import java.util.Scanner;

public class MarioKula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        1 2 3 4 5  --- (j) i (prva ide kroz redove(gore/dole), j (druga ide kroz kolone (levo/desno))

        * 1 (1) j <= i*2 - 1 / j <= 1*2-1     i=1
        *** 2 (3)              j <= 2*2-1     i=2
        ***** 3 (5)            j <= 3*2-1     i=3
        ******* 4 (7)          j <= 4*2-1     i=4
        ********* 5 (9)        j <= 5*2-1     i=5
        *********** 6 (11)     j <= 6*2-1     i=6
         */
        //pravilo zadatka je da ide neprarnim nizom 1,3,5,7,9,11

        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i*2 - 1 ; j++) {
                System.out.print('*');

            }
            System.out.println();
        }



    }
}
