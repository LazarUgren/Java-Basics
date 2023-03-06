package DomaciZadatci.DZ0;

import java.util.Arrays;
import java.util.Scanner;

/*
27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
Primer: [4, 2, 3, 5] -> 5 3 2 4
b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.
 */
public class DZ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int [] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++){
            System.out.println("Unesi " + (i + 1) + ". element niza");
            niz[i] = sc.nextInt();
        }

        System.out.println("Niz koje ste uneli izgleda ovako: ");
        ispisiNiz(niz);

        System.out.println("Obrnuti niz na prvi nacin izgleda ovako: ");
        ispisiNiz(obrniNiz(niz));

        System.out.println("Obrnuti niz na drugi nacin igleda ovako: ");
        ispisiNiz(obrniNiz2Nacin(niz));

        System.out.println("Obrnuti niz na treci nacin igleda ovako: ");
        ispisiNiz(obrniNiz3Nacin(niz));

        System.out.println("Obrnuti niz na cetvrti nacin igleda ovako: ");
        ispisiNiz(obrniNiz4Nacin(niz));

    }

    public static void ispisiNiz(int[] n){
        System.out.print("{");
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i]);
            if (i != n.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] obrniNiz(int[] niz){
        int[] noviNiz = new int [niz.length];
        for (int i = 0, j = niz.length - 1; i < niz.length; i++, j--){
            noviNiz[j] = niz[i];
        }
        return noviNiz;
    }

    public static int[] obrniNiz2Nacin (int [] niz){
        for (int i = 0, j = niz.length - 1; i < j; i++, j--){
            int c = niz[i];
            niz[i] = niz[j];
            niz[j] = c;
        }
        return niz;
    }

    public static int[] obrniNiz3Nacin (int[] niz){
        for (int i = 0; i < niz.length - 1 - i; i++){
            int c = niz[i];
            niz[i] = niz[niz.length - 1 - i];
            niz[niz.length - 1 - i] = c;
        }
        return niz;
    }

    public static int[] obrniNiz4Nacin (int[] niz){
        for (int i = 0, j = niz.length - 1; i < (niz.length / 2); i++, j--){
            int c = niz[j];
            niz[j] = niz[i];
            niz[i] = c;
        }
        return niz;
    }




}



