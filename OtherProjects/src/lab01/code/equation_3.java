package lab01.code;

import java.util.Scanner;

public class equation_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Giai pt: ax^2 + bx + c = 0");

    System.out.print("a = ");
    double a = scanner.nextDouble();

    System.out.print("b = ");
    double b = scanner.nextDouble();

    System.out.print("c = ");
    double c = scanner.nextDouble();

    double delta = b*b - 4 * a * c;
    if(delta > 0){
      double canDelta = Math.sqrt(delta);

      System.out.println("x1 = " + (-b + canDelta) / (2 *a));
      System.out.println("x2 = " + (-b - canDelta) / (2 *a));
    } else if (delta == 0){
      System.out.println("pt co nghiem kep x = " + -b / (2 * a));
    } else {
      System.out.println("pt ko co nghiem thuc");
    }

    scanner.close();
  }
}
