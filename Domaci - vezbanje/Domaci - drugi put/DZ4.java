package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
 */
public class DZ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite negativan broj: ");
        int broj = sc.nextInt();
        int ispis = broj - 1;
        if (broj > 0){
            System.out.println("Greska! Uneli ste pozitivan broj");
        } else {
            for (int i = 0; i >= broj; --i){
                ispis = ispis + 1;
                System.out.println(broj);
            }
        }
        /*
        int n = sc.nextInt();
        for (n=n; n <= 0; n++){
            System.out.println(n);
        }.........Ovako ga je uradio Strahinja, katastrofa kako je jednostavno u poredjenju sa mojim.
         */
    }
}
