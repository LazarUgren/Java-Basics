package Video15Funkcije;

public class Funkcije2 {
    public static void main(String[] args) {

        // Zadatak 1 = Napraviti void metodu "ime", u njoj odstampati ime, tu metodu samo pozvati u main metodi
        //Napraviti String metodu "Prezime" (nije void), u njoj samo uraditi inicijalizaciju prezimena u neki String
        // i odraditi return za taj String. U main metodi odstampati metodu Prezime

        Ime();
        System.out.println(prezume());
    }

    public static void Ime() {
        System.out.println("Dragoljub");
    }

    public static String prezume() {
        String ime = "Dragoljub";
        String lastName = "Boranijasevic";
        String grad = "Beograd";

        String vracen = ime + lastName + grad;
        return vracen;
    }
}
