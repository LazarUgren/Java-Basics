package PrviDrugiTreciCas;



    import java.util.Scanner;

public class UnetoImeTanja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String ime = sc.next();

        if (ime.equals("Tanja")) {
            System.out.println("Uneto ime je Tanja");


        } else {
            System.out.println("Uneto ime nije Tanja");


        }

        //------------------------------------

        System.out.println("Unesite pozitivan broj");
        int a = sc.nextInt();

        if (a >= 0) {
            System.out.println("Unet broj je pozitivan");
        } else {
            System.out.println("Unet broj je negativan");
        }

            //--------------------------

        System.out.println("Unesite neki broj: " );
        int x = sc.nextInt();

        if  (x < 0) {
            x = x * (-1);
        }
        System.out.println("Apsolutna vrednost od x je: " + x);

    }
}
