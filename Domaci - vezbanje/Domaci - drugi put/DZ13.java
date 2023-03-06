package DomaciZadatci.DZ0;
/*
13. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
 */
public class DZ13 {
    public static void main(String[] args) {
        int c = 0;
        System.out.println(c);
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                c = i * j;
                System.out.println(c);
            }
        }
    }
}
