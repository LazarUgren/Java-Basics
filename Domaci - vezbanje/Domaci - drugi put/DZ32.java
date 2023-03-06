package DomaciZadatci.DZ0;
/*
32. Napisati funkciju koja racuna proizvod 3 broja.
 */
public class DZ32 {
    public static void main(String[] args) {
        proizvodTRIbroja(3,3,3);
    }

    public static void proizvodTRIbroja (int a, int b, int c){
        int d = 0;
        d = a * b * c;
        System.out.println(d);
    }

}
