package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje;

public class whilePetlja {
    public static void main(String[] args) {

        int x = 10;
        while (x > 5/*neki uslov... tipa x > 5*/){
            //ovde ide neki kod.
            System.out.println(x);
            x--;
        }
        System.out.println("Kraj programa/while"/* ovo je neka komanda nakon koja sledi nakon komande iz tela petlje*/);

        //sve dok je uslov x > 5 tacan kod unutar petlje ce se izvrsavati.
        //kad se kod izvrsi, vracamo se na uslov, ako je ponovo tacan, ponovo se izvrsava kod iz tela petlja.
        //i tako u krug dok uslov postane netacan.
        //kad je uslov netacan, preskace se kod iz tela petlja i ide se dalje.

        System.out.println("++++++++++++++++++++++++");

        for (int xx = 10; xx > 5; xx--){//inicijalna postavka; uslov; update; (ili sto bih ja rekao, pocetna tacka, uslov, krajnja tacka/inkrement.
            System.out.println(xx);
        }
        System.out.println("Kraj programa/for");


    }
}
