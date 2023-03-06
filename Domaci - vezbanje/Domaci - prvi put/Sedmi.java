package DomaciZadatci;

import java.util.Scanner;

public class Sedmi {
    public static void main(String[] args) throws Exception {
        /*
        Napraviti program koji za unet mesec i dan ispisuje odgovarajuci
        horoskopski znak.
         */

        Scanner sc = new Scanner(System.in);


        System.out.println("Konventor datuma u horoskopske znake");
        System.out.print("Unesite mesec u godini malim slovima: ");
        String mesec = sc.next();
        String q = "Dodaj Pedji flasu piva";

        if (mesec.equals("januar")) {
        } else if (mesec.equals("februar")) {
        } else if (mesec.equals("mart")) {
        } else if (mesec.equals("april")) {
        } else if (mesec.equals("maj")) {
        } else if (mesec.equals("jun")) {
        } else if (mesec.equals("jul")) {
        } else if (mesec.equals("avgust")) {
        } else if (mesec.equals("septembar")) {
        } else if (mesec.equals("oktobar")) {
        } else if (mesec.equals("novembar")) {
        } else if (mesec.equals("decembar")) {
        } else {
            System.out.println(q);
        }

        System.out.print("Unesite dan u mesecu: ");
        int dan = sc.nextInt();
        String a = "Vas horoskopski znak je ";
        String x = "Ako ima problema obratiti se Kseniji Kostic";

        /*
        1   Ovan 21 mart/20 april                  januar    <= 20 jarac     >= 21 vodolija
        2   Bik 21 april/21 maj                    februar   <= 19 vodolija  >= 20 ribe
        3   Blizanci 22 maj/21 jun                 mart      <= 20 ribe      >= 21 ovan
        4   Rak 22 jun/22 jul                      april     <= 20 ovan      >= 21 bik
        5   Lav 23 jul/23 avgust                   maj       <= 21 bik       >= 22 blizanci
        6   Devica 24 avgust/23 septembar          jun       <= 21 blizanci  >= 22 rak
        7   Vaga 24 septembar/23 oktobar           jul       <= 22 rak       >= 23 lav
        8   Skorpija 24 oktobar/22 novembar        avgust    <= 23 lav       >= 24 devica
        9   Strelac 23 novembar/21 decembar        septembar <= 23 devica    >= 24 vaga
        10  Jarac 22 decembar/20 jaunar///         oktobar   <= 23 vaga      >= 24 skorpija
        11  Vodila 21 januar/19 februar///         novembar  <= 22 skorpija  >= 23 strelac
        12  Ribe 20 februar/20 mart                decembar  <= 21 strelac   >= 22 jarac
         */

            switch (mesec) {
                case "januar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 20) {
                        System.out.println(a + "Jarac");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 21) {
                        System.out.println(a + "Vodolija");
                    }
                    break;
                //januar    <= 20 jarac     >= 21 vodolija

                case "februar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 19) {
                        System.out.println(a + "Vodolija");
                    } else if (dan >= 29) {
                        System.out.println(q);
                    } else if (dan >= 20) {
                        System.out.println(a + "Ribe");
                    }
                    break;
                //februar   <= 19 vodolija  >= 20 ribe
                case "mart":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 20) {
                        System.out.println(a + "Ribe");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 21) {
                        System.out.println(a + "Ovan");
                    }
                    break;
                //mart      <= 20 ribe      >= 21 ovan
                case "april":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 20) {
                        System.out.println(a + "Ovan");
                    } else if (dan >= 31) {
                        System.out.println(q);
                    } else if (dan >= 21) {
                        System.out.println(a + "Bik");
                    }
                    break;
                //april     <= 20 ovan      >= 21 bik
                case "maj":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 21) {
                        System.out.println(a + "Bik");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 22) {
                        System.out.println(a + "Blizanci");
                    }
                    break;
                //maj       <= 21 bik       >= 22 blizanci
                case "jun":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 21) {
                        System.out.println(a + "Blizanci");
                    } else if (dan >= 31) {
                        System.out.println(q);
                    } else if (dan >= 22) {
                        System.out.println(a + "Rak");
                    }
                    break;
                //jun       <= 21 blizanci  >= 22 rak
                case "jul":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 22) {
                        System.out.println(a + "Rak");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 23) {
                        System.out.println(a + "Lav");
                    }
                    break;
                //jul       <= 22 rak       >= 23 lav
                case "avgust":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 23) {
                        System.out.println(a + "Lav");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 24) {
                        System.out.println(a + "Devica");
                    }
                    break;
                //avgust    <= 23 lav       >= 24 devica
                case "septembar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 23) {
                        System.out.println(a + "Devica");
                    } else if (dan >= 31) {
                        System.out.println(q);
                    } else if (dan >= 24) {
                        System.out.println(a + "Vaga");
                    }
                    break;
                //septembar <= 23 devica    >= 24 vaga
                case "oktobar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 23) {
                        System.out.println(a + "Vaga");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 24) {
                        System.out.println(a + "Skorpija");
                    }
                    break;
                //oktobar   <= 23 vaga      >= 24 skorpija
                case "novembar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 22) {
                        System.out.println(a + "Skorpija");
                    } else if (dan >= 31) {
                        System.out.println(q);
                    } else if (dan >= 23) {
                        System.out.println(a + "Strelac");
                    }
                    break;
                //novembar  <= 22 skorpija  >= 23 strelac
                case "decembar":
                    if (dan <= 0) {
                        System.out.println(q);
                    } else if (dan <= 21) {
                        System.out.println(a + "Strelac");
                    } else if (dan >= 32) {
                        System.out.println(q);
                    } else if (dan >= 22) {
                        System.out.println(a + "Jarac");
                    }
                    break;
                //decembar  <= 21 strelac   >= 22 jarac
                default:
                    if (dan >= 32) {
                        System.out.println(x);
                    }
                    break;
            }



    }
}


