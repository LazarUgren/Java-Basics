package Petlje;

public class whilePetlja {
    //Radicemo tri petlje: while petlja, do while i for petlju
    //razlikuju se u nekim sitnicama

    public static void main(String[] args) {

        System.out.println("Pocetak programa");
        int i = 1;

        while (i <= 10) {
            System.out.println("Otvorio sam petlju " + i + ". put"); // ovo je telo petlje
            i++; //inkrementacija (na zadatu vrednost dodajemo +1 pa ponovo krecemo sve dok smo u okviru uslova
            // i = 1 i uslov da je i manje od 10... kada dosegnemo uslov, petlja se zavrsava
        }
        System.out.println("Kraj petlje");

    }

}
