package lab01.code;

import java.util.Scanner;

public class equation_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Giai he pt: ");
    System.out.println("a11 * x1 + a12 * x2 = b1 ");
    System.out.println("a21 * x1 + a22 * x2 = b2 ");
    System.out.print("a11 = ");
    double a11 = scanner.nextDouble();
    System.out.print("a12 = ");
    double a12 = scanner.nextDouble();
    System.out.print("b1 = ");
    double b1 = scanner.nextDouble();
    System.out.print("a21 = ");
    double a21 = scanner.nextDouble();
    System.out.print("a22 = ");
    double a22 = scanner.nextDouble();
    System.out.print("b2 = ");
    double b2 = scanner.nextDouble();

    double D = a11 * a22  - a21 * a12;
    double D1 = b1 * a22 - b2 * a12;
    double D2 = a11 * b2 - a21 * b1;
    if(D != 0){
      System.out.println("x1 = " + D1/D);
      System.out.println("x2 = " + D2/D);
    } else if ( D == 0 && (D1 != 0 || D2 != 0)){
      System.out.println("he pt vo nghiem");
    } else {
      System.out.println("he pt vo so nghiem");
    }

    scanner.close();
  }
}
