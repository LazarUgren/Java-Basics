package Nizovi;

public class niztri {
    public static void main(String[] args) {

        /*
        zadatak 3: ispisati najmanji broj niza ako su clanovi
        niza od 1 do 100
        dodatak: ispisati razliku izmedju minimuma i maksimuma
        dodatak: koja je prosecna vrednost niza?
        p.s. brojevi u nizu su od 1 do 99 (dakle bez nule i 100 su 98)
         */
        System.out.println("Odstampaj niz");
        int[] niz = new int [100];

        for (int x = 1; x < niz.length; x++) {
            niz[x] = niz[x] + x;
            System.out.println(niz[x]);
        }
        System.out.println("**********************");

        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
        }
        int prosek = suma / 100;
        System.out.println("Prosecna vrednost niza je " + prosek);
        System.out.println("*************************");
        int max = 99;
        int min = 1;

        int razlika = min - max;
        System.out.println("Razlika izmedju min i max je " + razlika);
        System.out.println("Konacno kraj zadatka");

        //resenje sledi
        System.out.println("Resenje sledi: ");

        int [] zin = {11, 23, 8, 87, 55, 46, 93};
        int minA = 101;
        int maxB = 0;
        double sumaE = 0;

        for (int i = 0; i < zin.length; i++) {
            if (minA > zin[i]) {
                minA = zin[i];
            }
        }
        System.out.println("Minimum je " + minA);

        for (int i = 0; i < zin.length; i++) {
            if (maxB < zin[i]) {
                maxB = zin[i];
            }
        }
        System.out.println("Minimum je " + maxB);

        int razlikaC = minA - maxB;
        if (razlikaC < 0) {
            razlikaC = razlikaC * (-1);
        }
        System.out.println("(pozitivna) Razlika izmedju minimuma i maksimuma je " + razlikaC);

        for (int i = 0; i < niz.length; i++) {
            sumaE = sumaE + niz[i];
        }

        double prosekD = sumaE / niz.length;
        System.out.println("Prosek je " + prosekD);










    }
}
