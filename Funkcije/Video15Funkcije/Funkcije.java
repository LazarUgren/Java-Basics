package Video15Funkcije;

public class Funkcije {
    public static void main(String[] args) {
        System.out.println("Ispis iz main metode");
        ispisIzDrugeMetode();
        //ispisIzTreceMetode(); //Metoda koja nije static ne moze se videti u drugim metodama
        ispisIzCetvrteMetode(); // string postoji u mainu
        System.out.println(ispisIzCetvrteMetode()); // string je odstampan
        ispisIzPeteMetode();
        int mnozenje = ispisIzPeteMetode() * ispisIzPeteMetode();
        System.out.println(mnozenje);
    }

    public static void ispisIzDrugeMetode () {
        System.out.println("Prvi ispis u drugoj metodi");
        System.out.println("Drugi ispis iz druge metode");
    }

    public void ispisIzTreceMetode () {
        System.out.println("Ispis iz trece metode");
    }

    public static String ispisIzCetvrteMetode() {
        String ispis = "Ovo je ispis iz cetvrte metode";
        return ispis;
    }

    public static int ispisIzPeteMetode() {
        int broj = 5;
        return broj;
    }


}
