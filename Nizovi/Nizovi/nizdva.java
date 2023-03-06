package Nizovi;

public class nizdva {
    public static void main(String[] args) {
        //zadatak 2: upisati brojeve u niz i napisati sumu

        int[] nizBrojaDana = new int[4];

        nizBrojaDana [0] = 1;
        nizBrojaDana [1] = 2;
        nizBrojaDana [2] = 3;
        nizBrojaDana [3] = 4;


        int suma = 0;

        for (int i = 0; i < nizBrojaDana.length; i++) {
            suma = suma + nizBrojaDana[i];
            System.out.println(nizBrojaDana[i]);
        }
        System.out.println(suma);

            //****************************************

        for (int i = 0; i <nizBrojaDana.length; i ++) {
            nizBrojaDana[i] = i + 1;
            System.out.println(nizBrojaDana[i]);
        }


    }
}
