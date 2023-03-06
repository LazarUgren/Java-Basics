package Video19toStringStringBuilder;
/*
Ovo je nov materjal u klasama, tako da sada prelazimo na novu tematiku.

next cita do narednog belog znaka
nextLine cita do narednog znaka za novi red \n
problem moze da nastane ako citamo int ili neki drugi slican tip
i onda pozovemo nextLine, ako smo nakon unosa tog inta udarili enter
enter prelazi u novi red (unosi \n na unos)
citanjem inta sa nextInt ne cita se taj \n i kursor za citanje skenera ostaje na njemu
sledeci poziv nextLine ce se zaustaviti odmah jer je sledeci znak \n i vratice nista

kako resiti
ako zelimo da koristimo nextLine, nakon svako
 */

import java.util.Scanner;

public class NextVSNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi neki int: ");
        int a = sc.nextInt();

        //citam samo znak za novi red
        //sc.next();

        System.out.println("Unesi neki string: ");
        String s = sc.nextLine();

        System.out.println("Procitao sam " + s);
        //U kombinaciji sc.nextInt(); i sc.next();
        //uneti string, cita se samo prva rec lazar (od lazar ugrenovic)
        //ako se string ispise LazarUgrenovic ili Lazar_Ugrenovic ceo string se ispisuje
        //bitno je da nema spejsa (da ne pritisnes spase)
        //U slucaju sc.nextInt(); i sc.nextLine();
        //cim uneses int tj. broj i pritisnes entrer, on predje na
        //System.out.println("Procitao sam " + s); i stampa sledece
        //Procitao sam
        //Buduci da je skocio na stampu (ispis) nisi ni imao prilike
        //da preko skrenera ukucas taj String.


    }
}
