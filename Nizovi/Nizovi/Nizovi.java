package Nizovi;

public class Nizovi {
    public static void main(String[] args) {

        // 1. zadatak: ispisati dane u nedelji u nizu.
        // Dodatak: napraviti niz broja dana u nedelji i ispisati
        // pre naziva dana u nedelji


        String[] daniUNedelji = new String[7];
        String[] bDUN = new String[7];

        bDUN[0] = "Prvi";
        bDUN[1] = "Drugi";
        bDUN[2] = "Treci";
        bDUN[3] = "Cetvrti";
        bDUN[4] = "Peti";
        bDUN[5] = "Sesti";
        bDUN[6] = "Sedmi";

        daniUNedelji[0] = "Ponedeljak";
        daniUNedelji[1] = "Utorak";
        daniUNedelji[2] = "Sreda";
        daniUNedelji[3] = "Cetvratk";
        daniUNedelji[4] = "Petak";
        daniUNedelji[5] = "Subota";
        daniUNedelji[6] = "Nedelja";

        for (int x = 0; x < daniUNedelji.length; x++) {
            System.out.println(x + " " + bDUN[x] + " dan u nedelji je " + daniUNedelji[x]);
            

        }
    }
}
