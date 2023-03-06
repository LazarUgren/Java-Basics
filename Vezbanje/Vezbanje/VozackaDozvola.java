package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje;

import java.util.Scanner;

public class VozackaDozvola {
    public static void main(String[] args) {
        /*
        program obradjuje unete godine korisnika
        i izbacuje da li korisnik moze da podigne vozacku dozvolu

        ? godine >= 18
         */
        Scanner sc = new Scanner(System.in);

        int godine = sc.nextInt();

        if (godine >= 18){
            System.out.println("da");
        } else {
            System.out.println("ne");
        }
    }
}
