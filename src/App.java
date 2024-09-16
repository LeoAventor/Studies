import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, i, x;

        s = 0;
        i = 1;
        do {
            System.out.print(i + ".skaitlis ir: ");
            x = sc.nextInt();
            if (x >= 0) {
                s = s + x; // s+=x

            }
            i = i + 1; // i ++
        } while (i <= 10);
        System.out.println("s=" + s);

        sc.close();

    }
}