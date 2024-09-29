package Trijsturis;

import java.util.Scanner;

public class Main {
  public static void patstavigsdarbs(String[] args) {
    Scanner sc = new Scanner(System.in);
    double s = 0;
    int i = 2;
    while (i <= 20) {
      s = s + i / (i + 1); // Izteiksme, kas aprēķina summu
      i = i + 2;

      sc.close();

    }
  }
}