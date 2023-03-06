package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje;

import java.util.Scanner;

public class KadaKoristitiDoWhilePetlju {
    public static void main(String[] args) {
        /*
        Primer zadatka na koji moze da se upotrebi doWhile petlja
        ima mali broj takvih zadataka, a ovo je jedan od primera:
        Od korisnika trazim broj sve dok korisnik ne unese 0.
        Svaki put kada korisnik unese neki broj koji nije nula,
        ispisati ga u konzolu.
         */

        Scanner sc = new Scanner(System.in);

        /*
        int x = sc.nextInt();
        while (x != 0){
            x = sc.nextInt();
            System.out.println(x);

        }

         */
        int x;
        do {
            x = sc.nextInt();
            System.out.println(x);
        } while (x != 0);

    }
}
