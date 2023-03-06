package Video15Funkcije;

public class ZadatakSaCasa4 {
    public static void main(String[] args) {
        System.out.println(profili(1));

    }

    public static String profili(int x) {
        String[] ime = {"Milos", "Marko", "Andjela", "Anastasija"};
        String[] prezime = {"Jovanovic", "Mihajlovic", "Ilic", "Ivanovic"};
        int[] godine = {23, 44, 50, 34};

        String[] profil = new String[4];

        profil[0] = ime[0] + " " + prezime[0] + " " + godine[0];
        profil[1] = ime[1] + " " + prezime[1] + " " + godine[1];
        profil[2] = ime[2] + " " + prezime[2] + " " + godine[2];
        profil[3] = ime[3] + " " + prezime[3] + " " + godine[3];

        return profil[x];
        }

    }


