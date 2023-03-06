package Funkcije;

public class Fun1 {
    /*
    niz 1: inicijalizovati u main metodi
    niz 2: deklarisati u main metodi ali inicijalizovati u posebnoj metodi
    u main metodi napraviti treci niz koji ce sabrati ova dva niza
     */
    public static void main(String[] args) {
        int[] niz1 = {2, 2, 2};
        int[] niz2 = vraceniNiz (1, 2, 3);

        int[] sabiranje = {niz1[0] + niz2[0], niz1[1] + niz2[1], niz1[2] + niz2[2]};

        for (int i = 0; i < sabiranje.length; i++) {
            System.out.println(sabiranje[i]);
        }

        System.out.println("****************************");

        int[] sabiranjeFor = new int[3];
        for (int j = 0; j < niz1.length; j++) {
            sabiranjeFor[j] = niz1[j] + niz2[j];
        }
        for (int i = 0; i < sabiranjeFor.length; i++) {
            System.out.println(sabiranjeFor[i]);
        }
        System.out.println("Dva nacina iznad odvojena zvezdom");

    }

    public static int [] vraceniNiz(int x, int y, int z) {
        int[] nizIzDrugeMetode = {x, y, z};
        return nizIzDrugeMetode;
    }


}
