package lab01.code;
import java.util.Scanner;

public class Array_2 {
  private static void inputMatrix(Scanner scanner, int[][] a, int n, int m) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
            a[i][j] = scanner.nextInt();
        }
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("n = ");
    int n = scanner.nextInt();

    System.out.print("m = ");
    int m = scanner.nextInt();

    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    int[][] c = new int[n][m];

    System.out.println("Nhap ma tran thu nhat:");
    inputMatrix(scanner, a, n, m);

    System.out.println("Nhap ma tran thu hai:");
    inputMatrix(scanner, b, n, m);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
          c[i][j] = a[i][j] + b[i][j];
      }
  }

    // In kết quả
    System.out.println("ket qua cong 2 ma tran");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
          System.out.print(c[i][j] + " ");
      };
      System.out.print("\n");

    scanner.close();

    }
  }
}

