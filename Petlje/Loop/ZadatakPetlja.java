package Loop;

public class ZadatakPetlja {
    public static void main(String[] args) {

        /*Zadatak 1; napisati petlju koja ce 3 puta ispisati vase ime
          Zadatak 2; napisati petlju koja se nece pokrenuti
          Zadatak 3; Napraviti beskonacnu petlju
         */

        for (int i = 1; i <= 3; i++) {
            System.out.println("Lazar");
        }
        System.out.println("Kraj prve");
        //--------------------------------------

        for (int i = 2; i <= 1; i++) {
            System.out.println("test test");
        }
        System.out.println("Kraj druge");
        //-------------------------------------

        for (int i = 5; i <= 10;) {
            System.out.println("beskonacno");
        }
        System.out.println("Kraj trece");

        //-----------------------------------------

    }
}
