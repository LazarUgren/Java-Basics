package Funkcije;

public class Fun2 {
    /*
    Napraviti niz u main metodi
    U drugoj metodi kreirati niz koji se sastoji od elemenata
    deljivih sa 3 iz predhodnog niza (iz main metode)
     */

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {4, 51, 616, 156, 12, 67, 3, 33};
        int[] niz3 = {33, 30, 12, 14, 15};
        int[] niz4 = {1, 2, 4, 5};

        int[] vraceniNizDeljivSaTri = nizDeljivSaTri(niz4);

        for (int i = 0; i < vraceniNizDeljivSaTri.length; i++) {
            System.out.println(vraceniNizDeljivSaTri[i]);
        }


    }

    public static int[] nizDeljivSaTri (int[] xyz) {
        /*
        brojac nam je potreban kako bismo znali samo duzinu niza
        deljivog sa tri
         */
        int brojac = 0;
        for (int i = 0; i < xyz.length; i++) {
            if (xyz[i] % 3 == 0) {
                brojac = brojac + 1;
            }
        }

        int ind = 0;
        int[] vraceniNiz = new int [brojac];
        for (int i = 0; i < xyz.length; i++) {
            if (xyz[i] % 3 == 0) {
                /*promenljiva ind je prosledjena kako bismo odredili
                index broja koji je deljiv sa tri
                ako ne bismo imali ovu promenljivu onda bi petlja
                ubacivala na pogresno mesto brojeve deljive sa tri*/
                vraceniNiz[ind] = xyz[i];
                ind++;
            }
        }
        if (ind == 0) {
            System.out.println("Niz nema brojeve deljive sa tri");
        }
        return vraceniNiz;

    }

}
