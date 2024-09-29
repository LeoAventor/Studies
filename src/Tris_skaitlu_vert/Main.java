package Tris_skaitlu_vert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet a mainīgā vērtību: ");
        a = sc.nextDouble();

        System.out.println("Ievadiet b mainīgā vērtību: ");
        b = sc.nextDouble();

        System.out.println("Ievadiet c mainīgā vērtību: ");
        c = sc.nextDouble();

        if (a > b && a > c) {
            System.out.println(a);

        } else if (b > a && b > c) {
            System.out.println(b);

        } else {
            System.out.println(c);
        }
    }
}
