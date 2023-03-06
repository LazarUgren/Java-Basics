package Loop;

public class Suma {
    public static void main(String[] args) {

        System.out.println("Prikazi sumu brojeva od 1 do 10");
        int suma = 0;
        for (int i = 1 ; i <= 10 ; i++) {
            suma = suma + i;
            // suma += i; ovo ima isto znacenje kao i komanda iznad




        }
        System.out.println(suma);

        //provera
        int a = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(a);

        //*********************************************

        int j = 1;
        int sun = 0;
        while (j <=10) {
            sun += j;
            j++;

        }
        System.out.println(sun);

        //----------------------------------------------

        int x = 1;
        int su = 0;
        do {
            su = su + x;
            x++;
        } while (x <= 10);

        System.out.println(su);

    }
}
