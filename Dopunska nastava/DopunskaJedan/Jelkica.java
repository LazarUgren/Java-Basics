package DopunskaJedan;

public class Jelkica {
    public static void main(String[] args) {

        System.out.println("Nacrtaj mi jelku");

        String razmak = " ";
        String z = "*";

        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < 1; j++) {
                System.out.print(razmak);
            }
            System.out.println(z);
            z = z + "**";
        }

    }
}
