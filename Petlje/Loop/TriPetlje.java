package Loop;

public class TriPetlje {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;


        while (i <= 3) {
            System.out.println(i + ". Ovo je petlja");
            i++;
        }

        System.out.println("++++++++++++");

        //-----------------------------------------------------------

        do {
            System.out.println(i + ". Ovo je petlja");
            j++;
        } while (j <= 3);

        System.out.println("+++++++++++++++++++++++=");

        //------------------------------------------------------

        for (i = 1; i <= 3; i++) {
            System.out.println(i + ". Ovo je petlja");

        }
        System.out.println("+++++++++++++++++++++++++");
    }

}
