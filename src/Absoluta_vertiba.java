/*
// 1.variants
import java.util.Scanner;

public class Absoluta_vertiba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet x vertibu: ");
        int x = sc.nextInt();
        if (x < 0)
            x = -x;
        System.out.print(x);
        
    }
}
    */
//2.variants

import java.util.Scanner;

public class Absoluta_vertiba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet x vertibu: ");
        int x = sc.nextInt();
        if (x > 0)
            System.out.print(x);
        else
            System.out.println(-x);

    }
}