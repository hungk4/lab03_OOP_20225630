package lab01.code;

import java.util.Scanner;

public class Array_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("nhap kich thuoc mang: ");
    int n = scanner.nextInt();

    int[] a = new int[n];
    System.out.println("nhap tung phan tu cua mang:");
    long sum = 0;
    for(int i = 0; i < n; i++){
      a[i] = scanner.nextInt();
      sum += a[i];
    }

    for(int i = 0; i < n; i++) {
      for(int j  = i + 1; j < n; j++){
        if(a[j] < a[i]){
          int tmp;
          tmp = a[i];
          a[i] = a[j];
          a[j] = tmp;
        }
      }
    }

    System.out.println("tong cua mang = " + sum);
    System.out.println("mang sau khi sap xep:");
    for(int i = 0; i < n; i++){
      System.out.print(a[i] + " ");
    }

    scanner.close();
  }
}
// note