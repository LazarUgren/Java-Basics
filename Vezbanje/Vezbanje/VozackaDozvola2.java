package Video21ZnacenjeStatic_VezbanjeZadataka.Vezbanje;

import java.util.Scanner;

public class VozackaDozvola2 {
    public static void main(String[] args) {
         /*
        program obradjuje unete godine korisnika
        i izbacuje da li korisnik moze da podigne vozacku dozvolu

        ? godine >= 18

        dodatak...resenje treba da bude od 1 do 100 godina
        za svaku godinu dati odgovor da li je steceno pravo da se preuzme
        vozacka dozvola
        dodatak na dodatak ili korekcija zadatka,
        dodaje se jos jedan uslov,
        vozacku mogu da imaju od 18 do 65,
        dakle, mladji od 18 i stariji od 65 ne mogu da imaju vozacku.
         */

        Scanner sc = new Scanner(System.in);


        int godineW = 1;
        while (godineW <= 100){
            if (godineW >= 18 && godineW <= 65){
                System.out.println("Onaj ko ima " + godineW + " godina, moze da podigne vozacku dozvolu.");
            }
            else {
                System.out.println("Onaj ko ima " + godineW + " godina, ne moze da podigne vozacku dozvolu.");
            }
            godineW++;
        }

        System.out.println("+++Sada cu isto da uradim sa for petljom.+++");

        for (int godineF = 1; godineF <= 100; godineF++){
            if (godineF >= 18 && godineF <= 65){
                System.out.println("Onaj ko ima " + godineF + " godina, moze da podigne vozacku dozvolu.");
            }
            else {
                System.out.println("Onaj ko ima " + godineF + " godina, ne moze da podigne vozacku dozvolu.");
            }
        }

        System.out.println("???Sada cu isto da uradim sa do While petljom.???");
        //do pa u zagradi ide telo petlje tj. kod koji kucamo
        //nakon toga sledi while uslov
        //Kod doWhile je samo okrenut red operacija...on krece sa inicijalnim telom petlje, pa stigne do uslova
        //ako je uslov ispunjen pravi se rotacija tj. ponavlja se telo petlje i eto nama petlje.
        //ali, ako se uslov ne ispuni, on ide linearno dalje i to je to...sa petljom je zavrsio.
        //specificnost, imamo barem jedno izvrsenje


        int godineDW = 1;
        do {
            if (godineDW >= 18 && godineDW <= 65){
                System.out.println("Onaj ko ima " + godineDW + " godina, moze da podigne vozacku dozvolu.");
            }
            else {
                System.out.println("Onaj ko ima " + godineDW + " godina, ne moze da podigne vozacku dozvolu.");
            }
        } while (godineDW > 100);

    }
}
