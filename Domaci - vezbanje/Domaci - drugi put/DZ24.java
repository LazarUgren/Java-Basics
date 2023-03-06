package DomaciZadatci.DZ0;

import java.util.Scanner;

/*
24.* Za uneto m i n (intovi) iscrtati mxn sahovsku tablu, gde je beli polje oznaceno sa ' ' (space karakter),
	a crno polje sa '.' (tacka). Uzeti da je gornje levo polje uvek crno. Npr za m = 3, n = 3:
|. .|
| . |
|. .|
 */
public class DZ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi m: ");
        int m = sc.nextInt();
        System.out.println("Unesi n: ");
        int n = sc.nextInt();
        System.out.println("Sledi tabla saha: ");
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                if (i % 2 == 0){
                    if (j % 2 == 0) {
                        System.out.print('*');
                    } else {
                        System.out.print('#');
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print('#');
                    } else {
                        System.out.print('*');
                    }
                }

            }
            System.out.println();
        }
    }
}
