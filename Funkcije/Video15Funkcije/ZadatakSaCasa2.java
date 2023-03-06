package Video15Funkcije;

public class ZadatakSaCasa2 {
    public static void main(String[] args) {
        //Zadatak 2 - Iz main metode proslediti dva broja koji ce se mnoziti u drugoj metodi
        // Dodatak - Dva broja proslediti trecoj metodi koja ce da vrati veci broj

        proizvod(4, 6);

        System.out.println("Veci broj je: " + veciBroj(5, 7));


    }

    public static void proizvod (int x, int y) {
        int z = x * y;
        System.out.println("proizvod dva broja je " + z);
    }

    public static int veciBroj (int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;

        }
    }

}
