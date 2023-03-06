package Vid16VezbeNizoviFunkcije;
/*
Kako da ovo zamenimo, da u prvoj casi bude vodka, a u drugoj vinjak?
Pa sa samo dve case nikako. Potrebna nam je treca casa.
Onda to izgleda ovako.
Presipamo vinjak iz prve case u trecu casu,
Presipamo vodku iz druge case u prvu casu,
Presipamo vidnjak iz trece case u drugu casu.

Vratimo se na programerski problem
int a = 3;
int b = 5;
Kako zameniti vrednosti ovim promenljivim tako da
nova vrednost promenljive a bude stara vrednost promenljive b (u ovom slucaju 5)
a nova vrednost promenvljive b bude stara vrednost promenljive a (u ovom slucaju 3)

potrebna nam je treca promenljiva (casa) c
a je prva casa
b je druga casa
int c; (to je treca casa)
c = a; presipanje vinjaka iz prve case u trecu casu
a = b; presipanje vodke iz druge case u prvu
b = c; presipanje vinjaka iz trece case u drugu
 */

public class ZamenaVrednosti {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }
}
