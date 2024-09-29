// 241RDB260 Leonardo Abdelmasi
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     

        System.out.println("241RDB260 Leonardo Abdelmasi");
        System.out.println("2.variants");
        

        System.out.print("input number: ");
        byte n = sc.nextByte();


        byte mask = (byte) 0xAA;
        n = (byte) (n & mask)

        int count = 0;
        for (int i = 0; i < 8; i++) {
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }
        System.out.println("n=" + n);

        sc.close();
    }