package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje;

import java.util.Scanner;

public class ZadatakSaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        racunati sumu svih unetih brojeva dok korisnik ne unese 0.
         */

        int suma = 0;
        int i = sc.nextInt(); //inicijalna postavka
        while (i != 0){ // uslov
            suma += i;  // suma = suma + i;
            i = sc.nextInt(); // update
        }
        System.out.println("Suma je " + suma);

        System.out.println("??????????????????");
        System.out.println("Dugi nacin");

        // Drugi nacin na koji ovo moze da se odradi

        suma = 0;
        i = sc.nextInt(); //inicijalna postavka
        while (true){ // tehnicki uslov (petlja je beskonacna, tautoloska true == true)
            if (i == 0){ // uslov za izlazak iz beskonacne petlje!
                break;
            }
            suma += i;
            i = sc.nextInt(); // update
        }
        System.out.println("Suma je " + suma);

        System.out.println("++++++++++++++++");

        //Racunati zbir svih brojeva od j do ...beskonacnosti

        int j = sc.nextInt();
        int s = 0;
        while (true){
            s += j;
            j++;
            System.out.println(s);
        }


    }

}
