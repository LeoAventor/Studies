package Mainigie;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int a, b, c, m, x;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ievadiet a mainīgā vērtību: ");
        a = myObj.nextInt();

        System.out.println("Ievadiet b mainīgā vērtību: ");
        b = myObj.nextInt();

        System.out.println("Ievadiet c mainīgā vērtību: ");
        c = myObj.nextInt();

        System.out.println("Ievadiet m mainīgā vērtību: ");
        m = myObj.nextInt();

        x = a + b + c;

        if (x < m) {
            System.out.println("neieskaitīts");
        }
        if (x > m) {
            System.out.println("Ieskaitīts");

        }

    }
}