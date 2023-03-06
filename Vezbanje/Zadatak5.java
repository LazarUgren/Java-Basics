package Video17ShiftovanjeNiza;

import java.util.Scanner;

/*
Zadatak 5 - NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
Proizvoljno napravite niz od 10 brojeva
Korisnik unosi broj koji zeli da prebroji u nizu
niz je tipa int

Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
Primeri ispisa u konzoli

Unesite broj koji zelite da prebrojimo u nizu brojeva:
2
Broj 2 se pojavljuje 3. puta u nasem nizu brojeva

Primer ispisa kad se unese broj koji ne postoji u nizu brojeva:
8
Broj 8 se ne pojavljuje u nasem nizu
 */
public class Zadatak5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] niz = {2, 3, 6, 6, 6, 7, 8, 8, 9, 10};
        System.out.println("Unesite broj koji zelite da prebrojimo u nizu brojeva: ");
        int broj = sc.nextInt();
        kolikoPuta(niz, broj);

    }
    public static void kolikoPuta (int[] niz, int broj){
        int pojavljujeSe = 0;

        for (int i = 0; i < niz.length; i++){
            if (niz[i] == broj){
                pojavljujeSe++;
                //pojavljujeSe = pojavljujeSe + 1; ovo ima isto znacenje kao red iznad.
            }
        }
        if (pojavljujeSe == 0){
            System.out.println("Broj " + broj + " se ne pojavljuje u nizu");
        }
        else {
            System.out.println("Broj " + broj + " se pojavljuje " + pojavljujeSe + ". puta u vasem nizu brojeva");
        }
    }
}
