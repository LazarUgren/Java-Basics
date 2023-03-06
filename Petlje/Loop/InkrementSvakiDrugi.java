package Loop;

public class InkrementSvakiDrugi {
    public static void main(String[] args) {

        for (int i = 1; i < 20; i+=2) {
            System.out.println(i);
        }
        // i+=2 znaci prelayimo svaki treci
        // i+=3 znaci prelazimo svaki cetvrti itd.
    }
}
