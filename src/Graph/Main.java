package Graph;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("111RDB111 Jānis Programmētājs");
		System.out.println("0. variants");
				
		double x, y;
		
		System.out.print("x=");
		x = sc.nextDouble();
		
		System.out.print("y=");
		y = sc.nextDouble();
		
		System.out.println("result:");
		
		if (x>0 && y>0)
			System.out.print("grey");
		else
			System.out.print("white");
		
		sc.close();
	}

}
