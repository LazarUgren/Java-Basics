package Video20PaketiNIZOVIoBJEKATarrayList.ArrayListVezbanje;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> nizCelihBrojeva = new ArrayList<Integer>();

        nizCelihBrojeva.add(5);//1 element niza
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size());//provera duzine niza...niz je dug duzine 1

        nizCelihBrojeva.add(7);// 2 element niza
        nizCelihBrojeva.add(2);// 3 element niza
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size());// niz ima 3 clana

        nizCelihBrojeva.add(10);// 4 element niza
        nizCelihBrojeva.add(21);// 5 element niza
        nizCelihBrojeva.add(34);// 6 element niza
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size());// niz ima 6 clana

        for (int i = 0; i < nizCelihBrojeva.size() ; i++){
            int elementNaPoziciji = nizCelihBrojeva.get(i);
            System.out.println(elementNaPoziciji);
        }
        System.out.println("......................");

        nizCelihBrojeva.remove(2);
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size());
        System.out.println(nizCelihBrojeva);
        System.out.println("......................");
        nizCelihBrojeva.add(5, 666);//dodavanje jednog elementa unutar niza, ako niz ima 5 clana, ti mozes dodati i sesti,
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size()); // ali ne mozes dodati sedmi i veci na niz od 5 clana...jer nema sestog.
        System.out.println(nizCelihBrojeva);
        System.out.println("..........................");
        nizCelihBrojeva.set(1, 999);// 1 je drugo mesto ...set namesta drugi clan po nasoj volji.
        System.out.println(nizCelihBrojeva);
        System.out.println("__________________-");

        for (int element : nizCelihBrojeva){// ovako prolazimo kroz niz element po element putem petlje
            System.out.println(element);
        }
        System.out.println("________________");
        nizCelihBrojeva.clear();//brisanje elementa niza, tj. njegovih clanova...vracanje na null
        System.out.println("Niz je sada duzine: " + nizCelihBrojeva.size());
        System.out.println(nizCelihBrojeva);

    }
}
