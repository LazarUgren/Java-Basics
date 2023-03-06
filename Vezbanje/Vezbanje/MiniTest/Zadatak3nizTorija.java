package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje.MiniTest;

public class Zadatak3nizTorija {
    public static void main(String[] args) {
        // 5 3 1 - tri broja mojih tablica
        int broj1S = 5;
        int broj2S = 3;
        int broj3S = 1;

        // 2 3 4 - broj marijinih tablica
        int broj1M = 2;
        int broj2M = 3;
        int broj3M = 4;

        int[] brojTablicaS = {5, 3, 4};// prvi broj index 0, poslednji broj na indexu length - 1;
        int duzinaNiza = brojTablicaS.length;// ovim dobijamo duzinu niza ( = 3 )
        int[] brojTablicaM = {2, 3, 4};

        /*
        Oni su fiksne duzine, dakle duzinu niza ne mozemo menjati jednom kada se utvrdi,
        ali mozemo menjati elemetne unutar niza.
        Brojanje pocinje od 0, index 0
         */

        int[] nekiNiz = new int[5]; // [0, 0, 0, 0, 0]
        nekiNiz[4] = 1; // [0, 0, 0, 0, 1]
        System.out.println(nekiNiz[4]);
        System.out.println(nekiNiz[nekiNiz.length - 1]);
    }
}
