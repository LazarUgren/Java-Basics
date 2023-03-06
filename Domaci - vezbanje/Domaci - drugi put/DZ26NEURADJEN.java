package DomaciZadatci.DZ0;
/*
26.* Korisnik unosi novac na racunu kojim raspolaze kao i cenu nekog artikla. Na standardni izlaz ispisati koliko kopija tog
	artika korisnik moze da kupi.
 */

import java.util.Scanner;

public class DZ26NEURADJEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite sumu novca kojom raspolazete: ");
        double stanjeNaRacunu = sc.nextDouble();
        System.out.println("Unesite cenu artikla koji kupujete: ");
        double cenaArtikla = sc.nextDouble();

        double kalkulator;
        kalkulator = stanjeNaRacunu - cenaArtikla;



    }
}
