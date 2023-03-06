package Video21ZnacenjeStatic_VezbanjeZadataka.StaticObjasnjenje;

public class TestAiB {
    public static void main(String[] args) {
        A a1 = new A(3, 4);
        A a2 = new A(7, 8);
        B b1 = new B(3);
        B b2 = new B(5);
        B b3 = new B(7);
        B b4 = new B(9);

        System.out.println(a1.c);
        System.out.println(a2.c);
        System.out.println("????????????");

        a1.c = 10;

        System.out.println(a1.c);
        System.out.println(a2.c);
        System.out.println("!!!!!!!!!!!!!!!!!");

        a1.b = 19;
        System.out.println(A.b);
        a2.b = 17;
        System.out.println(A.b);

        System.out.println("%%%%%%%%%%%%");

        System.out.println(b1.ID);
        System.out.println(b2.ID);
        System.out.println(b3.ID);
        System.out.println(b4.ID);

    }
}
