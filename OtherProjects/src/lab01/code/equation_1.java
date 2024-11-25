package lab01.code;

import java.util.Scanner;

public class equation_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Giai pt bac nhat ax+b=0");
    System.out.println("nhap a va b: ");

    System.out.print("a = ");
    double a = scanner.nextDouble();
    
    System.out.print("b = ");
    double b = scanner.nextDouble();

    if(a == 0 && b == 0){
      System.out.println("pt vo so nghiem");
    } else if( a == 0 && b != 0){
      System.out.println("pt vo nghiem");
    } else{
      System.out.print("pt co nghiem la: x  = " + (-b/a) );
    }

    scanner.close();
  }
}
