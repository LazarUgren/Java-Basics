package Loop;

import java.util.Scanner;

public class Vozacka {
    public static void main(String[] args) {

        System.out.println("Unesite godine");

        int i = 0;

        while (i >= 0 && i <= 100) {
            if (i < 18) {
                System.out.println("Imate " + i + " godina. Maloletnim licima ne izdajemo vozacke dozvole.");
            } else if (i >= 18 && i < 65) {
                System.out.println("Imate " + i + " godina. Mozete imati vozacku dozvolu.");
            } else if (i <= 100) {
                System.out.println("Imate " + i + " godina. Ne mozete imati vozacku dozvolu.");
            }
            i++;
        }

        System.out.println("Kraj programa");

    }
}
