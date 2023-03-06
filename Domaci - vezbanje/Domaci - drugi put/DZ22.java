package DomaciZadatci.DZ0;
/*
22. Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:
|#
|##
|###
|####
|#####
(| obelezava pocetak reda i to ne crtate)
 */

import java.util.Scanner;

public class DZ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj kojim definisete stranice kule: ");
        int n = sc.nextInt();
        System.out.println("------------sledi kula ----------\n");
        for (int a = 0; a < n; a++){
            for (int b = 0; b < n; b++){
                if (b <= a){
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }

    }
}
