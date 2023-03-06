package PrviDrugiTreciCas;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        /* Savet: String a = sc.next(); // uzima samo prvu rec
                  String b = sc.nextLine(); // Uzima celu recenicu
                  */

        System.out.println("Unesi cifru dana u nedelji");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        String p = "Unet dan je ";

        switch (dan) {  //Switchu prosledjujemo sta ce da uporedjuje
            case 1: //Ovde switch uporedjuje prosledjen tip sa upisanim tipom nakon "case"-a
                System.out.println(p + "ponedeljak"); //Ako ispunjava uslov odradice ovaj blok/liniju
                break; //Naredjujemo da program stane nakon odredjenog bloka/linije
            case 2:
                System.out.println(p + "utorak");
                break;
            case 3:
                System.out.println(p + "sreda");
                break;
            case 4:
                System.out.println(p + "cetvrtak");
                break;
            case 5:
                System.out.println(p + "petak");
                break;
            case 6:
                System.out.println(p + "subota");
                break;
            case 7:
                System.out.println(p + "nedelja");
                break;
            default:
                System.out.println("Potrebno je uneti broj od 1 do 7");
                break;

        }

        //------------------------------------------

        System.out.println("Unesite tekst dana u nedelji");
        String danUNedelji = sc.next();

        switch (danUNedelji) {

            case  "ponedeljak":
                System.out.println(p + "1");
                break;
            case "utorak":
                System.out.println(p + "2");
                break;
            case  "sreda":
                System.out.println(p + "3");
                break;
            case "cetvrtak":
                System.out.println(p + "4");
                break;
            case  "petak":
                System.out.println(p + "5");
                break;
            case "subota":
                System.out.println(p + "6");
                break;
            case  "nedelja":
                System.out.println(p + "7");
                break;
            default:
                System.out.println("nije dobar unos");
                break;

        }

    }
}

