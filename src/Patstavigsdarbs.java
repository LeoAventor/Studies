import java.util.Scanner;

public class Patstavigsdarbs {
    public static void patstavigsdarbs(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, i;

        s = 0;
        i = 0.1;
        while (i <= 2.05) {
            s = s + Math.sin(i);
            i = i + 0.1;
        }
        System.out.printf("s=%.4f", s);

        sc.close();

    }
}