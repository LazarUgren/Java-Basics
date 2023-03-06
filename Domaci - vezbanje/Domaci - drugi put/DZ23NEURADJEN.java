package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
23. Za unetu visinu h, iscrtati desnu Mario kulu. Npr za h = 5:
|    #
|   ##
|  ###
| ####
|#####
 */
public class DZ23NEURADJEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int limit = sc.nextInt();
        System.out.println("________SLEDI KULICA_______");

        for (int a = 0; a < limit; a++){
            for (int b = 0; b < limit; b++){
                if (b <= a){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("--------------------");
        int w = sc.nextInt();

        for (w = w; w > 0; --w){
            for (int q = w; q > 0; --q){
                if (q <= w){
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("Unesite broj");
        int p = sc.nextInt();
        System.out.println("______sledi kulica_____");

        for (p = p; p > 0; --p){
            for (int i = 1; i < p; i++){
                if (p > i){
                    System.out.print(' ');
                } else if (i >= p){
                    System.out.println('*');
                }
            }
            System.out.println();
        }

    }
}



