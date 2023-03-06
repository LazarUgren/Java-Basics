package Loop;

public class PetljaUnutarPetlje {
    public static void main(String[] args) {
        System.out.println("Pocetak programa");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Ispis" + j);
            }
            System.out.println("*********");
        }

        System.out.println("Kraj programa");

    }
}
