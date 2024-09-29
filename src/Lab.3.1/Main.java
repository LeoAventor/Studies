//package Lab.3.1;//
// 241rdb260 Leonardo Abdelmasī

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        double x, y;
		
		x = 1; y = 1/x;
    
		System.out.printf("%.2f\t%.2f%n", x, y);
		System.out.printf("%.2f\tnot defined%n", x);
        System.out.println("input-output error");
			
		
		
		sc.close();
	}

}
