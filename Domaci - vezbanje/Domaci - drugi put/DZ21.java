package DomaciZadatci.DZ0;
/*
21.* Izracunati sumu povrsina svih kvadrata koji imaju celobrojne stranice cija je duzina manja od 200.
 */
public class DZ21 {
    public static void main(String[] args) {
        int p = 0;
        int povrsina = 0;
        for (int a = 1; a < 200; a++) {
            p = a * a;
            povrsina = povrsina + p;
        }
        System.out.println(povrsina);





    }






}

