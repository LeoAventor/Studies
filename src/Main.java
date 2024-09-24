// 241RDB260 Leonardo Abdelmasī

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }

        System.out.println("");
        if (sc.hasNextDouble()) {
            y = sc.nextDouble();
        } else {
            System.out.println("input-output error");
            sc.close();
            return;
        }

        boolean green;
        boolean red;
        boolean blue;
        boolean white;

        green = y > 8 && (x - 5) * (x - 5) + (y - 8) * (y - 8) < 1;
        red = x >= 3 && x <= 7 && y >= 3 && y < 7;
        blue = y >= 7 && y <= x + 5 && y <= 15 - x;
        white = x > 4 && x < 6 && y > 4 && y < 6;

        if (white) {
            System.out.println("white");
        
            
        } else if (green) {
            System.out.println("green");
        } else if (red) {
            System.out.println("red");
        } else {
            System.out.println("blue");
        }

        sc.close();
    }
}
